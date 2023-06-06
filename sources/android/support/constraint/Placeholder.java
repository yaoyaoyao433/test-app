package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Placeholder extends View {
    int a;
    View b;
    int c;

    public Placeholder(Context context) {
        super(context);
        this.a = -1;
        this.b = null;
        this.c = 4;
        a(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = null;
        this.c = 4;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.c);
        this.a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == R.styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.c = i;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    public View getContent() {
        return this.b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM);
            Paint paint = new Paint();
            paint.setARGB(255, TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.ROM_NOT_ENOUGH);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CommonConstant.Symbol.QUESTION_MARK, 0, CommonConstant.Symbol.QUESTION_MARK.length(), rect);
            canvas.drawText(CommonConstant.Symbol.QUESTION_MARK, ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.a == i) {
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(0);
            ((ConstraintLayout.a) this.b.getLayoutParams()).aa = false;
            this.b = null;
        }
        this.a = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}
