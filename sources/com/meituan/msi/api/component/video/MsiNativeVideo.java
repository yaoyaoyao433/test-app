package com.meituan.msi.api.component.video;

import android.content.Context;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiComponent(invokeParamType = JsonObject.class, name = "MSIVideo", property = VideoParam.class)
/* loaded from: classes3.dex */
public class MsiNativeVideo extends d implements IMsiComponent<JsonObject>, com.meituan.msi.lifecycle.b, com.meituan.msi.view.d {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ View a(String str, String str2, JsonObject jsonObject, MsiContext msiContext) {
        JsonObject jsonObject2 = jsonObject;
        Object[] objArr = {str, str2, jsonObject2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b493a98cbf6864efe4480174daec868", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b493a98cbf6864efe4480174daec868");
        }
        setIActivityContext(msiContext.getActivityContext());
        VideoParam videoParam = getVideoParam();
        videoParam.updateProperty(jsonObject2);
        a(videoParam);
        a(new c(msiContext.getEventDispatcher(), true, this));
        return this;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ boolean a(String str, String str2, JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        Object[] objArr = {str, str2, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c398d64b3b430f833256dd1ba4f756", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c398d64b3b430f833256dd1ba4f756")).booleanValue();
        }
        VideoParam videoParam = getVideoParam();
        videoParam.updateProperty(jsonObject2);
        a(videoParam);
        return true;
    }

    public MsiNativeVideo(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cc4980a7a41181a235dd9ca02119c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cc4980a7a41181a235dd9ca02119c2");
        }
    }

    public MsiNativeVideo() {
    }

    @Override // com.meituan.msi.api.component.video.d, com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a3d91243bf87d554ebf04b3e2b7a30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a3d91243bf87d554ebf04b3e2b7a30");
        } else {
            super.b(i);
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34fc0ada101993c9e2401ca1eb5cedf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34fc0ada101993c9e2401ca1eb5cedf");
        } else {
            c();
        }
    }

    @Override // com.meituan.msi.view.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e664fbf3e4006da9d3e18e5b479023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e664fbf3e4006da9d3e18e5b479023");
        } else {
            i();
        }
    }
}
