package com.example.calculator


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val math_op: TextView = findViewById(R.id.math_operation)
        val num0_but : Button = findViewById(R.id.num0_but)
        num0_but.setOnClickListener {
            math_op.append("0")
        }
        val num1_but : Button = findViewById(R.id.num1_but)
        num1_but.setOnClickListener {
            math_op.append("1")
        }
        val num2_but : Button = findViewById(R.id.num2_but)
        num2_but.setOnClickListener {
            math_op.append("2")
        }
        val num3_but : Button = findViewById(R.id.num3_but)
        num3_but.setOnClickListener {
            math_op.append("3")
        }
        val num4_but : Button = findViewById(R.id.num4_but)
        num4_but.setOnClickListener {
            math_op.append("4")
        }
        val num5_but : Button = findViewById(R.id.num5_but)
        num5_but.setOnClickListener {
            math_op.append("5")
        }
        val num6_but : Button = findViewById(R.id.num6_but)
        num6_but.setOnClickListener {
            math_op.append("6")
        }
        val num7_but : Button = findViewById(R.id.num7_but)
        num7_but.setOnClickListener {
            math_op.append("7")
        }
        val num8_but : Button = findViewById(R.id.num8_but)
        num8_but.setOnClickListener {
            math_op.append("8")
        }
        val num9_but : Button = findViewById(R.id.num9_but)
        num9_but.setOnClickListener {
            math_op.append("9")
        }
        val point_but : Button = findViewById(R.id.point_but)
        point_but.setOnClickListener {
            math_op.append(".")
        }
        val addition_but : Button = findViewById(R.id.addition_but)
        addition_but.setOnClickListener {
            math_op.append("+")
        }
        val subtraction_but : Button = findViewById(R.id.subtraction_but)
        subtraction_but.setOnClickListener {
            math_op.append("-")
        }
        val multiply_but : Button = findViewById(R.id.multiply_but)
        multiply_but.setOnClickListener {
            math_op.append("*")
        }
        val division_but : Button = findViewById(R.id.division_but)
        division_but.setOnClickListener {
            math_op.append("/")
        }
        val bracket_but1 : Button = findViewById(R.id.bracket_but1)
        bracket_but1.setOnClickListener {
            math_op.append("(")
        }
        val bracket_but2 : Button = findViewById(R.id.bracket_but2)
        bracket_but2.setOnClickListener {
            math_op.append(")")
        }
        val clear_but : Button = findViewById(R.id.clear_but)
        clear_but.setOnClickListener {
            math_op.text = ""
        }
        val cancel_but : Button = findViewById(R.id.cancel_but)
        cancel_but.setOnClickListener {
        var str : String = math_op.text.toString()
            if(str.isNotEmpty()) {
                math_op.text = str.substring(0, str.length-1)
            }
        }
        val equal_but : Button = findViewById(R.id.equal_but)
        equal_but.setOnClickListener {
          try {
          val  ex = ExpressionBuilder (math_op.text.toString()).build()
              val result = ex.evaluate()
              val tmpRes: Long = result.toLong()
              if(result == tmpRes.toDouble())
                  math_op.text = tmpRes.toString()
              else
                  math_op.text = result.toString()
          } catch (e:Exception)
          {
              Log.d("Error"," ${e.message}")
          }
        }

    }
}







