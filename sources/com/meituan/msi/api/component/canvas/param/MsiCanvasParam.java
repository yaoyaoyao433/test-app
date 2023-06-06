package com.meituan.msi.api.component.canvas.param;

import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.log.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class MsiCanvasParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean disableScroll;
    public boolean gesture;
    public boolean hide;

    public MsiCanvasParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c51b6d895269b28d0774264542f8168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c51b6d895269b28d0774264542f8168");
            return;
        }
        this.hide = false;
        this.disableScroll = false;
        this.gesture = false;
    }

    public void updateProperty(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dcc00729d28500a22502acdf1c54bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dcc00729d28500a22502acdf1c54bc7");
        } else if (jsonObject == null) {
        } else {
            try {
                if (jsonObject.has("gesture")) {
                    this.gesture = jsonObject.get("gesture").getAsBoolean();
                }
                if (jsonObject.has("hide")) {
                    this.hide = jsonObject.get("hide").getAsBoolean();
                }
                if (jsonObject.has("disableScroll")) {
                    this.disableScroll = jsonObject.get("disableScroll").getAsBoolean();
                }
            } catch (Throwable th) {
                a.a("MsiCanvasParam Error: " + th.getMessage());
            }
        }
    }
}
