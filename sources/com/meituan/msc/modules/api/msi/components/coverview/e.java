package com.meituan.msc.modules.api.msi.components.coverview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverImageViewParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends i implements com.meituan.msc.modules.api.msi.b {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.api.msi.e b;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d81fccf7df12bc0b6df6fc0e02a739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d81fccf7df12bc0b6df6fc0e02a739");
        } else {
            setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // com.meituan.msc.modules.api.msi.b
    public final void setViewContext(com.meituan.msc.modules.api.msi.e eVar) {
        this.b = eVar;
    }

    public final com.meituan.msc.modules.api.msi.e getViewContext() {
        return this.b;
    }

    public final void a(final MSCCoverImageViewParams mSCCoverImageViewParams, JsonObject jsonObject) {
        boolean z = false;
        Object[] objArr = {mSCCoverImageViewParams, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab61fc4bf15d65abacffb4277d7cd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab61fc4bf15d65abacffb4277d7cd7d");
            return;
        }
        boolean z2 = mSCCoverImageViewParams.clickable != null && mSCCoverImageViewParams.clickable.booleanValue();
        if (mSCCoverImageViewParams.gesture != null && mSCCoverImageViewParams.gesture.booleanValue()) {
            z = true;
        }
        MSCCoverViewTouchHelper.a(this, getViewContext(), mSCCoverImageViewParams.gesture);
        if (mSCCoverImageViewParams.clickable != null) {
            if (!z && z2) {
                setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.api.msi.components.coverview.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5639e49f6148f6c12f8ba16914bc7d3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5639e49f6148f6c12f8ba16914bc7d3");
                            return;
                        }
                        JsonObject jsonObject2 = new JsonObject();
                        jsonObject2.add("data", mSCCoverImageViewParams.data);
                        e.this.b.a("onImageViewClick", jsonObject2);
                    }
                });
            } else {
                setOnClickListener(null);
            }
        }
        RequestCreator a2 = r.a(getContext(), mSCCoverImageViewParams.iconPath, this.b.e.d());
        if (a2 != null) {
            int a3 = (int) n.a(jsonObject.has("width") ? jsonObject.get("width").getAsInt() : 0.0f);
            int a4 = (int) n.a(jsonObject.has("height") ? jsonObject.get("height").getAsInt() : 0.0f);
            if (a3 > 0 && a4 > 0) {
                a2.a(a3, a4);
            } else {
                a2.d();
            }
            a2.g().a(this, new Callback() { // from class: com.meituan.msc.modules.api.msi.components.coverview.e.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Callback
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37c3da684a666605cdb4ef7b20f111d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37c3da684a666605cdb4ef7b20f111d9");
                    } else {
                        e.this.b.a("imageLoadEvent", t.a("status", "success"));
                    }
                }

                @Override // com.squareup.picasso.Callback
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3479969fc4151dff46b8fc2531bd78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3479969fc4151dff46b8fc2531bd78");
                    } else {
                        e.this.b.a("imageLoadEvent", t.a("status", "error"));
                    }
                }
            });
            return;
        }
        this.b.a("imageLoadEvent", t.a("status", "error"));
    }
}
