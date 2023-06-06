package com.sankuai.waimai.irmo.canvas.instance;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSContext;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.container.INFBridge;
import com.sankuai.waimai.irmo.canvas.module.INFCanvasApi;
import com.sankuai.waimai.irmo.utils.d;
import com.sankuai.waimai.mach.manager.cache.c;
import java.util.HashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public FrameLayout b;
    public c c;
    public INFContext d;
    public INFJSContext e;
    public boolean f;
    public INFBridge g;
    public INFCanvasApi h;
    public HashSet<String> i;
    public Map<String, CanvasMap> j;

    public a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24dfc51caa38de6e8ec0c36dd8114ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24dfc51caa38de6e8ec0c36dd8114ebf");
            return;
        }
        this.d = new INFContext(this);
        this.d.setContext(context);
        this.d.setId(str);
        this.i = new HashSet<>();
    }

    public final void a(String str, CanvasMap canvasMap) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb747899b9438d921ea4f73a527b2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb747899b9438d921ea4f73a527b2b7");
        } else if (!TextUtils.isEmpty(str) && this.e != null) {
            if (this.i.contains(str)) {
                d.a("Java inf_canvas_log:  INFInstance sendEvent() , eventName: " + str + " params: null", new Object[0]);
                this.e.a(str, (CanvasMap) null);
                if (!"created".equals(str) || this.j == null || this.j.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, CanvasMap> entry : this.j.entrySet()) {
                    d.a("Java inf_canvas_log:  INFInstance supple event , eventName: " + entry.getKey(), new Object[0]);
                    this.e.a(entry.getKey(), entry.getValue());
                }
                this.j.clear();
                return;
            }
            if (this.j == null) {
                this.j = new ArrayMap();
            }
            d.a("Java inf_canvas_log:  INFInstance event not subscribe, save, eventName: " + str + " params: null", new Object[0]);
            this.j.put(str, null);
        }
    }
}
