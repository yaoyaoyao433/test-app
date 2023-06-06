package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CommentLabelView extends TextView implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private CommentLabel b;
    private int c;
    private int d;
    private int e;
    private String f;

    public CommentLabelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19da8b96563ace186f2e8ec711afb97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19da8b96563ace186f2e8ec711afb97");
            return;
        }
        this.e = -1;
        a();
    }

    public CommentLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d20f48e44baac1c0a54c7dab3f0002f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d20f48e44baac1c0a54c7dab3f0002f");
            return;
        }
        this.e = -1;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eddd175984112274cd59c7ba3b3677e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eddd175984112274cd59c7ba3b3677e");
        } else {
            setOnClickListener(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "223159329a340ae9647f0437bb7a54b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "223159329a340ae9647f0437bb7a54b4");
            return;
        }
        super.setSelected(z);
        if (this.b != null) {
            this.b.isSelected = z;
        }
    }

    @Override // android.view.View
    public boolean isSelected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69b6f0c95c6285e0cd9be952033fe77", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69b6f0c95c6285e0cd9be952033fe77")).booleanValue() : super.isSelected();
    }

    public int getType() {
        return this.d;
    }

    public void setScoreType(int i) {
        this.d = 2;
        this.c = i;
    }

    public void setLabel(CommentLabel commentLabel) {
        boolean z = true;
        Object[] objArr = {commentLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412ab81ba34a9232e3eddffd39951616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412ab81ba34a9232e3eddffd39951616");
            return;
        }
        String str = commentLabel == null ? null : commentLabel.content;
        Object[] objArr2 = {commentLabel, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55ee8ee6101ba42f32f1e323b14f1644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55ee8ee6101ba42f32f1e323b14f1644");
            return;
        }
        this.d = 1;
        this.b = commentLabel;
        super.setSelected((commentLabel == null || !this.b.isSelected) ? false : false);
        setText(str);
    }

    public CommentLabel getLabel() {
        return this.b;
    }

    @NonNull
    public String getNonNullText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb38fc25d97de150f9efd9373a79587f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb38fc25d97de150f9efd9373a79587f");
        }
        CharSequence text = super.getText();
        return text == null ? "" : text.toString();
    }

    public long getLabelId() {
        if (this.b == null) {
            return 0L;
        }
        return this.b.labelId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de32d0eff31c12d243349202283ddd6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de32d0eff31c12d243349202283ddd6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56073083c95325a41b013e5dd6e9f470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56073083c95325a41b013e5dd6e9f470");
        } else {
            setSelected(!isSelected());
        }
    }

    public int getScoreType() {
        return this.c;
    }

    private void setBold(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc8707f01c8b129cbddf0b72d63af53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc8707f01c8b129cbddf0b72d63af53");
            return;
        }
        TextPaint paint = getPaint();
        if (z) {
            paint.setFakeBoldText(true);
        } else {
            paint.setFakeBoldText(false);
        }
    }

    public void setLabelIndex(int i) {
        this.e = i;
    }

    public int getLabelIndex() {
        return this.e;
    }

    public void setLogText(String str) {
        this.f = str;
    }

    public String getLogText() {
        return this.f == null ? "" : this.f;
    }
}
