package com.androidhands.responsivegroupedbarchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private static final String TAG = "TAG";

    List<Sales> salesList = new ArrayList<>();
    List<String> products = new ArrayList<>();
    List<String> monthsList = new ArrayList<>();

    HorizontalBarChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChart = findViewById(R.id.chart1);

        setData(12, 50);


    }

    private void setData(int count, int range){

        ArrayList<BarEntry> yVals = new ArrayList<>();
        float barWidth = 19f;
        float spaseForBar = 2f;

        for (int i = 0; i <count; i++){
            float val = (float) (Math.random()*range);
            yVals.add(new BarEntry(i*spaseForBar, val));
        }

        BarDataSet set1;

        set1 = new BarDataSet(yVals, "Data Set 1");

        BarData data = new BarData(set1);

        mChart.setData(data);
    }
}
