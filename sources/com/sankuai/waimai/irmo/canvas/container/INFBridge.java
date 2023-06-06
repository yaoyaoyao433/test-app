package com.sankuai.waimai.irmo.canvas.container;

import android.os.Message;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSCallBack;
import com.sankuai.waimai.irmo.canvas.bridge.a;
import com.sankuai.waimai.irmo.canvas.component.INFComponent;
import com.sankuai.waimai.irmo.canvas.instance.INFContext;
import com.sankuai.waimai.irmo.utils.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class INFBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.sankuai.waimai.irmo.canvas.animtor.a mInfAnimFrameManager;
    private INFContext mInfContext;
    private com.sankuai.waimai.irmo.canvas.bridge.a mTimerManager;

    public INFBridge(INFContext iNFContext) {
        Object[] objArr = {iNFContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb39b4f9c38889c096beb8949813cbf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb39b4f9c38889c096beb8949813cbf6");
        } else {
            this.mInfContext = iNFContext;
        }
    }

    private INFComponent createComponent(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f28804c71b65c1a0836e958151df9c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (INFComponent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f28804c71b65c1a0836e958151df9c4");
        }
        d.a("Java inf_canvas_log: UIComponent create -->tag = " + str, new Object[0]);
        this.mInfContext.createComponent();
        INFComponent bodyComponent = this.mInfContext.getBodyComponent();
        if (bodyComponent != null) {
            bodyComponent.setNativeNodePtr(j);
        } else {
            d.a("Java inf_canvas_log: instance UI component failed:-->tag = " + str, new Object[0]);
        }
        return bodyComponent;
    }

    private long createTimer(INFJSCallBack iNFJSCallBack, long j, boolean z) {
        Object[] objArr = {iNFJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2032dc36f39531e10d26045b8d4b29a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2032dc36f39531e10d26045b8d4b29a9")).longValue();
        }
        if (this.mTimerManager == null) {
            this.mTimerManager = new com.sankuai.waimai.irmo.canvas.bridge.a();
        }
        com.sankuai.waimai.irmo.canvas.bridge.a aVar = this.mTimerManager;
        Object[] objArr2 = {iNFJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.bridge.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "1b0997b4e3bb213134453a91242b91a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "1b0997b4e3bb213134453a91242b91a1")).longValue();
        }
        aVar.d++;
        Message obtainMessage = aVar.b.obtainMessage(1);
        a.RunnableC0970a runnableC0970a = new a.RunnableC0970a(iNFJSCallBack, aVar.d, z, j);
        obtainMessage.obj = runnableC0970a;
        aVar.b.sendMessageDelayed(obtainMessage, j);
        aVar.e.put(Long.valueOf(aVar.d), new WeakReference<>(runnableC0970a));
        return aVar.d;
    }

    private void removeTimer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c487b36c0b4ef563a59da937a4336b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c487b36c0b4ef563a59da937a4336b9e");
        } else if (this.mTimerManager != null) {
            com.sankuai.waimai.irmo.canvas.bridge.a aVar = this.mTimerManager;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.bridge.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "65a9fea17648430b5a9f3268dc26c851", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "65a9fea17648430b5a9f3268dc26c851");
                return;
            }
            WeakReference<a.RunnableC0970a> remove = aVar.e.remove(Long.valueOf(j));
            if (remove == null || remove.get() == null) {
                return;
            }
            aVar.b.removeCallbacksAndMessages(remove.get());
            aVar.c.removeCallbacks(remove.get());
        }
    }

    private void showJsLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "906e668a848cac917760a0e98ed50ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "906e668a848cac917760a0e98ed50ae3");
            return;
        }
        com.sankuai.waimai.irmo.canvas.instance.a iNFContext = this.mInfContext.getInstance();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.instance.a.a;
        if (PatchProxy.isSupport(objArr2, iNFContext, changeQuickRedirect3, false, "68a8de690011d3134e72e3400340a658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iNFContext, changeQuickRedirect3, false, "68a8de690011d3134e72e3400340a658");
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7afeb8d57b1fbfb2bb12646ddeb1bf7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7afeb8d57b1fbfb2bb12646ddeb1bf7e");
            return;
        }
        if (this.mTimerManager != null) {
            com.sankuai.waimai.irmo.canvas.bridge.a aVar = this.mTimerManager;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.bridge.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "f86783f155a04759f27e08f3e616f9db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "f86783f155a04759f27e08f3e616f9db");
            } else {
                aVar.b.removeCallbacksAndMessages(null);
            }
        }
        if (this.mInfAnimFrameManager != null) {
            com.sankuai.waimai.irmo.canvas.animtor.a aVar2 = this.mInfAnimFrameManager;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.irmo.canvas.animtor.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "42b257d9fc5191098bd01bef4ea8f119", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "42b257d9fc5191098bd01bef4ea8f119");
            } else if (aVar2.b != null) {
                aVar2.b.clear();
            }
        }
    }

    private void requestAnimationFrame(INFJSCallBack iNFJSCallBack, int i) {
        Object[] objArr = {iNFJSCallBack, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1866f3a61116cdcb16374d86a4f1a347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1866f3a61116cdcb16374d86a4f1a347");
            return;
        }
        if (this.mInfAnimFrameManager == null) {
            this.mInfAnimFrameManager = new com.sankuai.waimai.irmo.canvas.animtor.a();
        }
        com.sankuai.waimai.irmo.canvas.animtor.a aVar = this.mInfAnimFrameManager;
        Object[] objArr2 = {iNFJSCallBack, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.animtor.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "1a869b449f41bf27e5076d05149e06b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "1a869b449f41bf27e5076d05149e06b1");
            return;
        }
        if (aVar.b == null) {
            aVar.b = new ConcurrentHashMap();
        }
        aVar.b.put(Integer.valueOf(i), iNFJSCallBack);
    }

    private void cancelAnimationFrame(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e802361bc75617932342bea9f80bbd85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e802361bc75617932342bea9f80bbd85");
        } else if (this.mInfAnimFrameManager != null) {
            com.sankuai.waimai.irmo.canvas.animtor.a aVar = this.mInfAnimFrameManager;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.animtor.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "2857a9d07ecece0c32edfeca0da77252", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "2857a9d07ecece0c32edfeca0da77252");
            } else if (aVar.b != null) {
                aVar.b.remove(Integer.valueOf(i));
            }
        }
    }

    private void throwJSException(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ab9ae3b95f66da5f9d450fdcf49dc13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ab9ae3b95f66da5f9d450fdcf49dc13");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        d.e("Java inf_canvas_log:  JS Error: " + str, new Object[0]);
        com.sankuai.waimai.irmo.mach.c.a("INFJSException", this.mInfContext.getBundle(), 1, str);
    }

    public void frameCallback() {
        INFJSCallBack iNFJSCallBack;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "114b874676a71e8ba25fa305f8dc1831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "114b874676a71e8ba25fa305f8dc1831");
        } else if (this.mInfAnimFrameManager != null) {
            com.sankuai.waimai.irmo.canvas.animtor.a aVar = this.mInfAnimFrameManager;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.animtor.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "2209cb0191fc53f42e41b688303a5e85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "2209cb0191fc53f42e41b688303a5e85");
            } else if (aVar.b == null || aVar.b.size() <= 0) {
            } else {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(aVar.b);
                aVar.b.clear();
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() != null && (iNFJSCallBack = (INFJSCallBack) entry.getValue()) != null) {
                        iNFJSCallBack.invoke(null);
                    }
                    it.remove();
                }
            }
        }
    }
}
