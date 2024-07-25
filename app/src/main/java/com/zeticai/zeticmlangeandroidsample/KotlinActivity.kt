package com.zeticai.zeticmlangeandroidsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zetic.ZeticMLange.ZeticMLangeModel
import java.nio.ByteBuffer

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Zetic MLange Model Running

        // (1) Prepare model inputs
        val inputs: Array<ByteBuffer> = emptyArray() // Prepare your inputs

        // (2) Load Zetic MLange model
        val model = ZeticMLangeModel(this, "MODEL KEY")

        // (3) Run model and get outputs
        model.run(inputs)

        // (4) Get output buffers
        val outputs = model.outputBuffers
    }
}