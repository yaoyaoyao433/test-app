package com.meituan.android.customerservice.callkefuuisdk.widget;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallKFOperationView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;

    public CallKFOperationView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac266dfd0d49f2cc132dc65e023d6e45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac266dfd0d49f2cc132dc65e023d6e45");
        } else {
            a();
        }
    }

    public CallKFOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d00cf643ff98c674cecfe72708031f36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d00cf643ff98c674cecfe72708031f36");
        } else {
            a();
        }
    }

    public CallKFOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c0dbf347efbf4741807d29b42714bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c0dbf347efbf4741807d29b42714bc");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f5b9d1051d320c63866ddb2beb2bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f5b9d1051d320c63866ddb2beb2bd5");
            return;
        }
        inflate(getContext(), R.layout.cs_voip_view_operation, this);
        this.b = (ImageView) findViewById(R.id.iv_mute);
        this.c = (ImageView) findViewById(R.id.iv_keyboard);
        this.d = (ImageView) findViewById(R.id.iv_hands_free);
        this.e = (ImageView) findViewById(R.id.iv_hang_up);
        this.f = (TextView) findViewById(R.id.tv_mute);
        this.h = (TextView) findViewById(R.id.tv_hands_free);
        this.g = (TextView) findViewById(R.id.tv_keyboard);
        this.i = (TextView) findViewById(R.id.tv_hang_up);
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b907835e9bd261d0ef17f0255e57e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b907835e9bd261d0ef17f0255e57e17");
        } else if (onClickListener == null) {
        } else {
            this.b.setOnClickListener(onClickListener);
            this.c.setOnClickListener(onClickListener);
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setMuteImgRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a932768a353c4127d57e326b633cd79b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a932768a353c4127d57e326b633cd79b");
        } else {
            this.b.setImageResource(i);
        }
    }

    public void setHandsFreeImgRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f0ca02da0eda032845b184d10f822f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f0ca02da0eda032845b184d10f822f");
        } else {
            this.d.setImageResource(i);
        }
    }

    public void setKeyboardImgRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7169ea866682617837cca032c025761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7169ea866682617837cca032c025761");
        } else {
            this.c.setImageResource(i);
        }
    }

    public void setHangUpImgRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819e5bcc45650577a21ad56e0de106d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819e5bcc45650577a21ad56e0de106d7");
        } else {
            this.e.setImageResource(i);
        }
    }

    public void setMuteTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559dbb966b9a3af5eb96ea56af0fd256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559dbb966b9a3af5eb96ea56af0fd256");
        } else {
            this.f.setTextColor(i);
        }
    }

    public void setHangUpTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3b5e9bc3c05ec2a952f1a59c04aea5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3b5e9bc3c05ec2a952f1a59c04aea5");
        } else {
            this.i.setTextColor(i);
        }
    }

    public void setKeyboardTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5304a3de32aa178167e46056b67cb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5304a3de32aa178167e46056b67cb37");
        } else {
            this.g.setTextColor(i);
        }
    }

    public void setHandsFreeTvTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d3a3a6d991680977d8871c126012d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d3a3a6d991680977d8871c126012d0");
        } else {
            this.h.setTextColor(i);
        }
    }

    public void setKeyboardViewEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9130eb7d2a2e41478b5a6d20c0d1d2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9130eb7d2a2e41478b5a6d20c0d1d2b6");
        } else {
            this.c.setEnabled(z);
        }
    }
}
