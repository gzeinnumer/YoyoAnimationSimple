# YoyoAnimationSimple
 Thanks to https://github.com/daimajia/AndroidViewAnimations

---

## Download
```gradle
maven { url 'https://jitpack.io' }
implementation 'com.daimajia.androidanimations:library:2.3@aar'
```

## Feature List
- [x] **Auto `VISIBLE` or `GONE` android View Widget with animation**.

## Tech stack and 3rd library
- YoyoAnimation ([docs](https://github.com/daimajia/AndroidViewAnimations))

---

## PREPARE

Make this class

- `AnimFunction.java`
[See Code][]

## USE

Simple example, Click screen to start animation
- `MainActivity.java`
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout parent = findViewById(R.id.parent);
        Button button = findViewById(R.id.btn);

        parent.setOnClickListener(v -> {
            AnimFunction.animationIn(button);

            new Handler().postDelayed(() -> AnimFunction.animationOut(button), 5000);
        });
    }
}
```
- `activity_main.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/parent"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:visibility="invisible"/>

</LinearLayout>
```

---

```
Copyright 2020 M. Fadli Zein
```
