package joerichard.net.weather.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import joerichard.net.weather.R;
import joerichard.net.weather.models.HourlyDatum;
import joerichard.net.weather.ui.Colors;
import joerichard.net.weather.ui.GlyphIcon;

public class HourlyRecyclerAdapter extends RecyclerView.Adapter<HourlyRecyclerAdapter.ViewHolder> {

    Context context;
    List<HourlyDatum> datumList;
    GlyphIcon glyphIcon;
    Colors colors;

    public HourlyRecyclerAdapter(Context context, List<HourlyDatum> datumList) {
        this.datumList = datumList;
        glyphIcon = new GlyphIcon(context);
        colors = new Colors();
    }

    /**
     * Создание новых View и ViewHolder элемента списка, которые впоследствии могут переиспользоваться.
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_hourly, viewGroup, false);
        this.context = viewGroup.getContext();
        return new ViewHolder(v);
    }

    /**
     * Заполнение виджетов View данными из элемента списка с номером i
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        HourlyDatum hourly = datumList.get(i);
        viewHolder.tvHourlyTime.setText(String.valueOf(hourly.getTimeString()));
        viewHolder.tvHourlyTemp.setText(hourly.getTemperatureString());
        glyphIcon.setGlyphIcon(viewHolder.tvHourlyIcon, hourly.getIcon());
        viewHolder.tvHourlySummary.setText(String.valueOf(hourly.getSummary()));

        if(hourly.isNighttime()){
            colors.setColors(viewHolder.itemView, viewHolder.listitem_daily_divider, Colors.CLEAR_NIGHT);
        }
        else {
            colors.setColors(viewHolder.itemView, viewHolder.listitem_daily_divider, hourly.getIcon());
        }

    }

    @Override
    public int getItemCount() {
        return datumList.size();
    }

    /**
     * Реализация класса ViewHolder, хранящего ссылки на виджеты.
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvHourlyTime;
        private TextView tvHourlyTemp;
        private TextView tvHourlyIcon;
        private TextView tvHourlySummary;
        private View listitem_daily_divider;

        public ViewHolder(View itemView) {
            super(itemView);
            tvHourlyTime = (TextView) itemView.findViewById(R.id.tvHourlyTime);
            tvHourlyTemp = (TextView) itemView.findViewById(R.id.tvHourlyTemp);
            tvHourlyIcon = (TextView) itemView.findViewById(R.id.tvHourlyIcon);
            tvHourlySummary = (TextView) itemView.findViewById(R.id.tvHourlySummary);
            listitem_daily_divider = (View) itemView.findViewById(R.id.listitem_daily_divider);
        }
    }
}