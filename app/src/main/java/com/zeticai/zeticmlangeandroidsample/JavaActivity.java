package com.zeticai.zeticmlangeandroidsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zetic.ZeticMLange.ZeticMLangeModel;

import java.nio.ByteBuffer;

public class JavaActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Zetic MLange model running

        // (1) Prepare model inputs
        ByteBuffer[] inputs = {};// Prepare your inputs;

        // (2) Load Zetic MLange model
        ZeticMLangeModel model = new ZeticMLangeModel(this, "MODEL KEY");

        // (3) Run model and get outputs
        model.run(inputs);

        // (4) Get output buffers
        ByteBuffer[] outputs = model.getOutputBuffers();
    }
}
