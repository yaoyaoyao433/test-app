package com.meituan.android.customerservice.callkefuuisdk.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallKFStateView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ImageView e;

    public CallKFStateView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce41111f13baad4461f8e441cab87ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce41111f13baad4461f8e441cab87ab");
        } else {
            a();
        }
    }

    public CallKFStateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929b8fb3e48b5e83a3b59dee3fbb0041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929b8fb3e48b5e83a3b59dee3fbb0041");
        } else {
            a();
        }
    }

    public CallKFStateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745f563f75280289ff07c5419f14eec1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745f563f75280289ff07c5419f14eec1");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0df77002667640aae8156b08b6d3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0df77002667640aae8156b08b6d3b4");
            return;
        }
        inflate(getContext(), R.layout.cs_voip_view_state, this);
        this.b = (TextView) findViewById(R.id.tv_customer_service_name);
        this.c = (TextView) findViewById(R.id.tv_call_kf_state);
        this.d = (TextView) findViewById(R.id.tv_time);
        this.e = (ImageView) findViewById(R.id.iv_customer_service_avatar);
    }

    public void setCallState(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73281382f383c1bb030e9b2de0e06910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73281382f383c1bb030e9b2de0e06910");
        } else {
            this.c.setText(charSequence);
        }
    }

    public TextView getTimeTextView() {
        return this.d;
    }

    public void setNameText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0e49610783aa0f5b5c992354de4f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0e49610783aa0f5b5c992354de4f58");
        } else {
            this.b.setText(str);
        }
    }

    public void setNameTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3bf1877853202ce6afeb3802b68bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3bf1877853202ce6afeb3802b68bac");
        } else {
            this.b.setTextColor(i);
        }
    }

    public void setCallStateColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2828cbf4b902968902088014a517d4c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2828cbf4b902968902088014a517d4c5");
        } else {
            this.c.setTextColor(i);
        }
    }

    public void setCallTimeTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bae9f5271b40450d00c05799167a13e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bae9f5271b40450d00c05799167a13e");
        } else {
            this.d.setTextColor(i);
        }
    }

    public void setAvatarImgUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f667c9c71ad98c168cd055d5ebc19aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f667c9c71ad98c168cd055d5ebc19aea");
            return;
        }
        RequestCreator d = Picasso.g(getContext().getApplicationContext()).d(str);
        d.c = true;
        d.e = false;
        d.g = R.drawable.cs_voip_customer_service_avatar;
        d.a(this.e);
    }
}
