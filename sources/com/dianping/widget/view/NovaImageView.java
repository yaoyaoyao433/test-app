package com.dianping.widget.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaImageView extends ImageView implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private View.OnClickListener c;
    private String d;
    private com.dianping.judas.b e;

    public NovaImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a582dbabacdfe58fea29c8f7342dae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a582dbabacdfe58fea29c8f7342dae");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
    }

    public NovaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8ecef8c38f266d88011386cd457001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8ecef8c38f266d88011386cd457001");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public NovaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea029edeb80f25c567433b456343d986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea029edeb80f25c567433b456343d986");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947aa96b150dfa2dac9b9faabca0afba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947aa96b150dfa2dac9b9faabca0afba");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.d = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b54efa812e31b3f2a54e76514cc5e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b54efa812e31b3f2a54e76514cc5e84");
            return;
        }
        super.setOnClickListener(onClickListener);
        this.c = onClickListener;
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6d4507501779532ab3c60bd35ea2ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6d4507501779532ab3c60bd35ea2ea")).booleanValue();
        }
        if (this.c != null) {
            a.a().a(this, "click", EventName.MGE);
        }
        return super.performClick();
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28895981e67c219c0111d41ca700147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28895981e67c219c0111d41ca700147");
        } else {
            this.e.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e3dc0725ae969d65c31d65c41c7ceb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e3dc0725ae969d65c31d65c41c7ceb") : this.e.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea27c6727d7173889692e3968ea8f3fd", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea27c6727d7173889692e3968ea8f3fd") : this.e.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564ebab1a8dae229d9852e74e4b0b891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564ebab1a8dae229d9852e74e4b0b891");
        } else {
            this.e.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c1ae7ade699bd4ac97920e5a364bde", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c1ae7ade699bd4ac97920e5a364bde") : this.e.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bcee1fef036fa6fb103413a8a382a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bcee1fef036fa6fb103413a8a382a4b");
        } else {
            this.e.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98f4609aca79035087539c3d1409e15", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98f4609aca79035087539c3d1409e15") : this.e.b(aVar);
    }

    public void setExposeBlockId(String str) {
        this.d = str;
    }
}
