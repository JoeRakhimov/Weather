package joerichard.net.weather.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import joerichard.net.weather.R;
import joerichard.net.weather.models.DailyDatum;
import joerichard.net.weather.ui.Colors;
import joerichard.net.weather.ui.GlyphIcon;
import joerichard.net.weather.utils.DateUtil;

/**
 * Created by joe on 01.04.16.
 */
public class DailyRecyclerAdapter extends RecyclerView.Adapter<DailyRecyclerAdapter.ViewHolder> {

    Context context;
    List<DailyDatum> datumList;
    GlyphIcon glyphIcon;
    Colors colors;

    public DailyRecyclerAdapter(Context context, List<DailyDatum> datumList) {
        this.datumList = datumList;
        glyphIcon = new GlyphIcon(context);
        colors = new Colors();
    }

    /**
     * Создание новых View и ViewHolder элемента списка, которые впоследствии могут переиспользоваться.
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_daily, viewGroup, false);
        this.context = viewGroup.getContext();
        return new ViewHolder(v);
    }

    /**
     * Заполнение виджетов View данными из элемента списка с номером i
     */
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        DailyDatum daily = datumList.get(i);
        glyphIcon.setGlyphIcon(viewHolder.tvDailyIcon, daily.getIcon());
        viewHolder.tvDailyWeekday.setText(DateUtil.getDDM(daily.getTime())+" "+daily.getWeekday(context.getResources().getStringArray(R.array.weekdays)));
        viewHolder.tvDailySummary.setText(daily.getSummary());
        viewHolder.tvDailyTemperature.setText(daily.getMinMaxTemperature());
        colors.setColors(viewHolder.itemView, viewHolder.listitem_daily_divider, daily.getIcon());

    }

    @Override
    public int getItemCount() {
        return datumList.size();
    }

    /**
     * Реализация класса ViewHolder, хранящего ссылки на виджеты.
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDailyIcon;
        private TextView tvDailyWeekday;
        private TextView tvDailySummary;
        private TextView tvDailyTemperature;
        private View listitem_daily_divider;

        public ViewHolder(View itemView) {
            super(itemView);
            tvDailyIcon = (TextView) itemView.findViewById(R.id.tvDailyIcon);
            tvDailyWeekday = (TextView) itemView.findViewById(R.id.tvDailyWeekday);
            tvDailySummary = (TextView) itemView.findViewById(R.id.tvDailySummary);
            tvDailyTemperature = (TextView) itemView.findViewById(R.id.tvDailyTemperature);
            listitem_daily_divider= (View) itemView.findViewById(R.id.listitem_daily_divider);
        }
    }
}
