package com.homelink.app

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.graphics.Color
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 40, 28, 40)
            setBackgroundColor(Color.rgb(15, 23, 42))
        }

        fun makeText(value: String, size: Float): TextView {
            return TextView(this).apply {
                text = value
                textSize = size
                setTextColor(Color.WHITE)
                gravity = Gravity.CENTER
                setPadding(12, 18, 12, 18)
            }
        }

        layout.addView(makeText("HomeLink", 32f))
        layout.addView(makeText("کنترل هوشمند گوشی خانه", 18f))
        layout.addView(makeText("وضعیت اتصال: هنوز متصل نشده", 16f))

        val buttons = listOf(
            "مدیریت فایل‌ها",
            "مشاهده اعلان‌ها",
            "اتصال به گوشی خانه",
            "تنظیمات امنیتی"
        )

        buttons.forEach { name ->
            val button = Button(this).apply {
                text = name
                setOnClickListener {
                    Toast.makeText(
                        this@MainActivity,
                        "این قابلیت در نسخه بعدی فعال می‌شود",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            layout.addView(button)
        }

        setContentView(layout)
    }
}
