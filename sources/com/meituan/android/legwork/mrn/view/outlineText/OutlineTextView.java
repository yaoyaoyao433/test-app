package com.meituan.android.legwork.mrn.view.outlineText;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.text.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OutlineTextView extends ReactTextView {
    public static ChangeQuickRedirect a;
    private TextView b;
    private int c;
    private int d;
    private ForegroundColorSpan e;

    public OutlineTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ef30df26ceeffd0b934d70a180a044", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ef30df26ceeffd0b934d70a180a044");
            return;
        }
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.b = new TextView(context);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c47d38d6d2702b6ebeb9f0774e0d00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c47d38d6d2702b6ebeb9f0774e0d00c");
            return;
        }
        super.setLayoutParams(layoutParams);
        if (this.b == null) {
            return;
        }
        this.b.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea4a7f5ac9d1ab596356b69ed067eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea4a7f5ac9d1ab596356b69ed067eb3");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b == null) {
            return;
        }
        this.b.measure(i, i2);
    }

    @Override // com.facebook.react.views.text.ReactTextView, android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04f3b535da509047959ddac1944f03a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04f3b535da509047959ddac1944f03a");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == null) {
            return;
        }
        this.b.layout(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731e3177e54ad1a935c486e4e9eb2194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731e3177e54ad1a935c486e4e9eb2194");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ec3ccc517c0c6b4a57ec8c50cb475a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ec3ccc517c0c6b4a57ec8c50cb475a8");
        } else if (this.c <= 0) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            TextPaint paint = this.b.getPaint();
            paint.setStrokeWidth(this.c);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.b.setGravity(getGravity());
            this.b.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // com.facebook.react.views.text.ReactTextView
    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        Object[] objArr = {truncateAt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371f93f7aadff294360f9a2e408f137e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371f93f7aadff294360f9a2e408f137e");
            return;
        }
        super.setEllipsizeLocation(truncateAt);
        if (this.b == null) {
            return;
        }
        this.b.setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c859bafc0f82cdc7077fe2eda454ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c859bafc0f82cdc7077fe2eda454ad0");
            return;
        }
        super.setEnabled(z);
        if (this.b == null) {
            return;
        }
        this.b.setEnabled(z);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b274f5ddd42af992b4f1b8d384fee96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b274f5ddd42af992b4f1b8d384fee96");
            return;
        }
        super.setGravity(i);
        if (this.b == null) {
            return;
        }
        this.b.setGravity(i);
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da95d03634e4b604a7348df18832e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da95d03634e4b604a7348df18832e17");
            return;
        }
        super.setIncludeFontPadding(z);
        if (this.b == null) {
            return;
        }
        this.b.setIncludeFontPadding(z);
    }

    @Override // com.facebook.react.views.text.ReactTextView
    public void setNumberOfLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99f00c161d3c3bde23cf41d56124ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99f00c161d3c3bde23cf41d56124ab8");
            return;
        }
        super.setNumberOfLines(i);
        if (this.b == null) {
            return;
        }
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.b.setSingleLine(i == 1);
        this.b.setMaxLines(i);
    }

    @Override // com.facebook.react.views.text.ReactTextView
    public void setText(i iVar) {
        int i;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5979c00a31327b52c3689fd668fb818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5979c00a31327b52c3689fd668fb818");
            return;
        }
        super.setText(iVar);
        if (this.b == null) {
            return;
        }
        Spannable a2 = iVar.a();
        if (this.b.getText() != null && a2 == null) {
            this.b.setText((CharSequence) null);
            return;
        }
        if (a2 != null) {
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(this.e, 0, a2.toString().length(), 18);
            this.b.setText(spannableString);
        }
        Object[] objArr2 = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5097d8741a00e9731902df78b4b1b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5097d8741a00e9731902df78b4b1b55");
            return;
        }
        float c = iVar.c();
        float d = iVar.d();
        float e = iVar.e();
        float f = iVar.f();
        if (c != -1.0f && f != -1.0f && e != -1.0f && i != 0) {
            this.b.setPadding((int) Math.floor(c), (int) Math.floor(d), (int) Math.floor(e), (int) Math.floor(f));
        }
        if (this.b.getGravity() != iVar.g()) {
            this.b.setGravity(getGravity());
        }
        if (Build.VERSION.SDK_INT >= 23 && this.b.getBreakStrategy() != iVar.h()) {
            this.b.setBreakStrategy(iVar.h());
        }
        if (Build.VERSION.SDK_INT < 26 || this.b.getJustificationMode() == iVar.i()) {
            return;
        }
        this.b.setJustificationMode(iVar.i());
    }

    public void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "963b270f69068dff2a96368dd6a54be0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "963b270f69068dff2a96368dd6a54be0");
            return;
        }
        this.d = i;
        this.e = new ForegroundColorSpan(this.d);
    }

    public void setStrokeWidth(int i) {
        this.c = i;
    }
}
