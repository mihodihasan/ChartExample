package com.mh_lushan.droiddigger.chartexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<SliceValue> values = new ArrayList<SliceValue>();
        values.add(new SliceValue(20,Color.BLUE,1));
        values.add(new SliceValue(20,Color.BLACK,1));
        values.add(new SliceValue(20,Color.WHITE,1));
        values.add(new SliceValue(40,Color.GREEN,1));

        PieChartData data = new PieChartData(values);

        PieChartView chart = (PieChartView) findViewById(R.id.chart);
        chart.setPieChartData(data);

    }
}
