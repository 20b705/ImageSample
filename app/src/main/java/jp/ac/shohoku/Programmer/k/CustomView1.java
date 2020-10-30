package jp.ac.shohoku.Programmer.k;

import android.content.Context;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Created by utsumi on 2020/10/30.
 * Andorid端末でグラフィックス表示をするためのサンプルです.
 */
public class CustomView1 extends View {
    //コンストラクタ１
    public CustomView1(Context context) {
        super(context);
    }
    //コンストラクタ２
    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    //コンストラクタ３
    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    /**
     * このメソッドで描画をします
     * ＠param canvas 画像表示のキャンバス
     */
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);

        int w = this.getWidth();
        int h = this.getWidth();
        Paint p = new Paint();
        p.setStyle(Style.STROKE);     //Styleを設定：線で書く
        p.setColor(Color.DKGRAY);     //色を設定
        canvas.drawRect(new Rect(5, 5, w - 10, h - 10), p);  //長方形を描画

        for (int i = 0; i< 10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Style.FILL);  //Style を設定：塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0)); //色を設定
            canvas.drawCircle(25*i+125, 25*i+125, 100,p2); //円を描く
        }
    }

}

