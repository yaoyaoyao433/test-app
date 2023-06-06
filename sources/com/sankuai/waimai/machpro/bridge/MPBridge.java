package com.sankuai.waimai.machpro.bridge;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Message;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.adapter.d;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.a;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MPBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MPContext mMachContext;
    private com.sankuai.waimai.machpro.module.b mModuleManager;
    private a mTimerManager;

    public MPBridge(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b09bc33d981e610b750a3175d3e3bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b09bc33d981e610b750a3175d3e3bb");
            return;
        }
        this.mMachContext = mPContext;
        this.mModuleManager = new com.sankuai.waimai.machpro.module.b();
    }

    private MachArray getModuleMethods(String str) {
        MachArray machArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7bae8f915acc96bc049a1183e5d5845", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7bae8f915acc96bc049a1183e5d5845");
        }
        com.sankuai.waimai.machpro.module.a<? extends MPModule> d = f.a().d(str);
        if (d != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.module.a.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect3, false, "afaaf5b9f722a231d41d562b1f862d18", RobustBitConfig.DEFAULT_VALUE)) {
                machArray = (MachArray) PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect3, false, "afaaf5b9f722a231d41d562b1f862d18");
            } else {
                if (d.c == null) {
                    d.a();
                }
                MachArray machArray2 = new MachArray();
                for (String str2 : d.c.keySet()) {
                    MachMap machMap = new MachMap();
                    machMap.put("moduleName", d.b);
                    machMap.put("methodName", d.c.get(str2).b);
                    machMap.put("numberOfArguments", Integer.valueOf(d.c.get(str2).c));
                    machArray2.add(machMap);
                }
                machArray = machArray2;
            }
            com.sankuai.waimai.machpro.util.a.d("getModuleMethods | moduleName = " + str + " | methods = " + machArray.toString());
            return machArray;
        }
        com.sankuai.waimai.machpro.util.a.a("NativeModule：" + str + " is not found!");
        return null;
    }

    private Object callJavaModule(String str, String str2, Object[] objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "128b5465432fa0ebf141f175f5568e19", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "128b5465432fa0ebf141f175f5568e19");
        }
        MPModule a = this.mModuleManager.a(str);
        com.sankuai.waimai.machpro.module.a<? extends MPModule> d = f.a().d(str);
        if (a == null) {
            a = d.a(this.mMachContext);
            com.sankuai.waimai.machpro.module.b bVar = this.mModuleManager;
            Object[] objArr3 = {str, a};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.module.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "815bdfadebbbe185abbe4d563a6e609e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "815bdfadebbbe185abbe4d563a6e609e");
            } else if (!TextUtils.isEmpty(str) && a != null) {
                bVar.b.put(str, a);
            }
        }
        return d.a(this.mMachContext, a, str2, objArr);
    }

    public MPModule getModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "739dcd5bf19532927010202f1d05953e", RobustBitConfig.DEFAULT_VALUE) ? (MPModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "739dcd5bf19532927010202f1d05953e") : this.mModuleManager.a(str);
    }

    private MPComponent<? extends View> createComponent(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b04de9f56886b0077de0819b1a1133f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPComponent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b04de9f56886b0077de0819b1a1133f4");
        }
        com.sankuai.waimai.machpro.component.b<? extends MPComponent<? extends View>> e = f.a().e(str);
        if (e == null) {
            String str2 = "UIComponent not found-->tag = " + str;
            com.sankuai.waimai.machpro.util.a.a(str2);
            if (!f.a().i.i || this.mMachContext.getInstance() == null) {
                return null;
            }
            this.mMachContext.getInstance().a(new RuntimeException(str2));
            return null;
        }
        MPComponent<? extends View> a = e.a(this.mMachContext);
        if (a != null) {
            a.setNativeNodePtr(j);
        } else {
            com.sankuai.waimai.machpro.util.a.a("instance UI component failed:-->tag = " + str);
        }
        return a;
    }

    private MachArray getComponentJSMethods(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59926e6dd4ee2fc3d08da205bac24c49", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59926e6dd4ee2fc3d08da205bac24c49");
        }
        com.sankuai.waimai.machpro.component.b<? extends MPComponent<? extends View>> e = f.a().e(str);
        if (e == null) {
            com.sankuai.waimai.machpro.util.a.a("UIComponent JSMethod parse failed:-->tag = " + str);
            return null;
        }
        return e.a();
    }

    private Object callComponentMethod(MPComponent<? extends View> mPComponent, String str, String str2, Object[] objArr) {
        com.sankuai.waimai.machpro.component.b<? extends MPComponent<? extends View>> e;
        Object[] objArr2 = {mPComponent, str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdbb64401009d5c634445a0c5a2e8cd5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdbb64401009d5c634445a0c5a2e8cd5");
        }
        if (mPComponent == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (e = f.a().e(str)) == null) {
            return null;
        }
        MPContext mPContext = this.mMachContext;
        Object[] objArr3 = {mPContext, mPComponent, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.component.b.a;
        if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "68f4e3603e152ec5d8b56ad1e4266fc9", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "68f4e3603e152ec5d8b56ad1e4266fc9");
        }
        if (e.c == null) {
            e.c = com.sankuai.waimai.machpro.util.b.a((Class) e.b);
        }
        com.sankuai.waimai.machpro.module.c cVar = e.c.get(str2);
        if (cVar != null) {
            return cVar.a(mPContext, mPComponent, objArr);
        }
        return null;
    }

    private long createTimer(MPJSCallBack mPJSCallBack, long j, boolean z) {
        Object[] objArr = {mPJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "781d458fa271a8c8dad39b29569073fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "781d458fa271a8c8dad39b29569073fa")).longValue();
        }
        if (this.mTimerManager == null) {
            this.mTimerManager = new a();
        }
        a aVar = this.mTimerManager;
        Object[] objArr2 = {mPJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "f4ec9e957aa6ef5bc804c76c44554bf1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "f4ec9e957aa6ef5bc804c76c44554bf1")).longValue();
        }
        aVar.d++;
        Message obtainMessage = aVar.b.obtainMessage(1);
        a.RunnableC1023a runnableC1023a = new a.RunnableC1023a(mPJSCallBack, aVar.d, z, j);
        obtainMessage.obj = runnableC1023a;
        aVar.b.sendMessageDelayed(obtainMessage, j);
        aVar.e.put(Long.valueOf(aVar.d), new WeakReference<>(runnableC1023a));
        return aVar.d;
    }

    private void removeTimer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a1c84d8118dc5371eb24e5bd1ae53f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a1c84d8118dc5371eb24e5bd1ae53f");
        } else if (this.mTimerManager != null) {
            a aVar = this.mTimerManager;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "ea2a309778f91af51f02177beca5a0d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "ea2a309778f91af51f02177beca5a0d2");
                return;
            }
            WeakReference<a.RunnableC1023a> remove = aVar.e.remove(Long.valueOf(j));
            if (remove == null || remove.get() == null) {
                return;
            }
            aVar.b.removeCallbacksAndMessages(remove.get());
            aVar.c.removeCallbacks(remove.get());
        }
    }

    private long getNtpTimestamp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c09adc8970ff4e729bf8a2f07f0ebad0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c09adc8970ff4e729bf8a2f07f0ebad0")).longValue();
        }
        com.sankuai.waimai.machpro.adapter.c cVar = f.a().c;
        return (cVar != null ? cVar.a() : System.currentTimeMillis()) / 1000;
    }

    private int getStatusBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91dbfae6845076673dd930f8f34e29fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91dbfae6845076673dd930f8f34e29fb")).intValue();
        }
        d dVar = f.a().e;
        if (dVar == null) {
            return 0;
        }
        return dVar.a((Activity) this.mMachContext.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r5.x != r3.findViewById(16908290).getWidth()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (r6.bottom != r5.y) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float getSoftMenuBarHeight() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.bridge.MPBridge.getSoftMenuBarHeight():float");
    }

    private void showAlertDialog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6fb5a4d1a742f6e01fe31a9b002d664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6fb5a4d1a742f6e01fe31a9b002d664");
            return;
        }
        if (str == null) {
            str = "";
        }
        new AlertDialog.Builder(this.mMachContext.getContext()).setMessage(str).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.machpro.bridge.MPBridge.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "75ff081ab0bf77b7bafff78ac8572165", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "75ff081ab0bf77b7bafff78ac8572165");
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).create().show();
    }

    private void requireBundleAsync(String str, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aa439060701acf0ef5e8cf29f1935ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aa439060701acf0ef5e8cf29f1935ed");
            return;
        }
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        Object[] objArr2 = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "0a49e65dae1bb3d0db82dca4df2657a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "0a49e65dae1bb3d0db82dca4df2657a3");
        } else if (mPContext.s != null) {
            mPContext.s.a(str, mPJSCallBack);
        }
    }

    private void showJsLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01674aa8e964e74b791add6cea687b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01674aa8e964e74b791add6cea687b15");
            return;
        }
        if (this.mMachContext.getInstance() != null) {
            this.mMachContext.getInstance().a(str);
        }
        if (f.a().i.i) {
            com.sankuai.waimai.machpro.util.a.b(str);
        }
    }

    private void subscribeEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57f953730eefc6be8a5cc8af63531324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57f953730eefc6be8a5cc8af63531324");
            return;
        }
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "4fa996e9182eacd504fe9975108f42a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "4fa996e9182eacd504fe9975108f42a5");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (mPContext.k == null) {
                mPContext.k = new HashSet();
            }
            if (mPContext.k.contains(str)) {
                return;
            }
            mPContext.k.add(str);
        }
    }

    private void unsubscribeEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5451711cd0b381c218ecf4bb050eba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5451711cd0b381c218ecf4bb050eba7");
            return;
        }
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "f5b4d471a90a650fd8d01448b6af19e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "f5b4d471a90a650fd8d01448b6af19e1");
        } else if (TextUtils.isEmpty(str) || mPContext.k == null) {
        } else {
            mPContext.k.remove(str);
        }
    }

    private void onReceiveEvent(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa9169fc4bd2481bc66ebe5aa5006a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa9169fc4bd2481bc66ebe5aa5006a89");
            return;
        }
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        Object[] objArr2 = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "295a1a99128d400cc087cab81eb3c0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "295a1a99128d400cc087cab81eb3c0d4");
        } else if (mPContext.l != null) {
            Iterator<h> it = mPContext.l.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next != null) {
                    next.a(str, machMap);
                }
            }
        }
    }

    private void onJobEnding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85af0d401c18f46985f89f4cc6e2c09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85af0d401c18f46985f89f4cc6e2c09d");
            return;
        }
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "2fd246a6a0539c4c411340ee0662829d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "2fd246a6a0539c4c411340ee0662829d");
        } else if (mPContext.m != null) {
            Iterator<c> it = mPContext.m.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20b32de4cd52a2cc088637e6574928fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20b32de4cd52a2cc088637e6574928fa");
        } else if (this.mTimerManager != null) {
            a aVar = this.mTimerManager;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "89fb4732c7ca67c6d8bd62469f010e9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "89fb4732c7ca67c6d8bd62469f010e9e");
            } else {
                aVar.b.removeCallbacksAndMessages(null);
            }
        }
    }

    private void requestAnimationFrame(MPJSCallBack mPJSCallBack, int i) {
        Object[] objArr = {mPJSCallBack, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13d74e82502de82ec2bfa967c778a81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13d74e82502de82ec2bfa967c778a81e");
            return;
        }
        com.sankuai.waimai.machpro.animator.a a = com.sankuai.waimai.machpro.animator.a.a();
        Object[] objArr2 = {mPJSCallBack, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "11282d30c0f124fbaa329b0bf629c5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "11282d30c0f124fbaa329b0bf629c5c3");
            return;
        }
        if (a.b == null) {
            a.b = new ConcurrentHashMap();
        }
        a.b.put(Integer.valueOf(i), new WeakReference<>(mPJSCallBack));
    }

    private void cancelAnimationFrame(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf80b7c6c2b1890db8a9d902e18972f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf80b7c6c2b1890db8a9d902e18972f");
            return;
        }
        com.sankuai.waimai.machpro.animator.a a = com.sankuai.waimai.machpro.animator.a.a();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "6c12b32bc7b968a25cca06ec82346b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "6c12b32bc7b968a25cca06ec82346b83");
        } else if (a.b != null) {
            a.b.remove(Integer.valueOf(i));
        }
    }

    private void throwJSException(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c192558f151fb70963d9dcb2e8f7429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c192558f151fb70963d9dcb2e8f7429");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        this.mMachContext.getInstance().a(new Exception(str));
    }

    private float getScreenWidth() {
        DisplayMetrics displayMetrics;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16c2028b7ae0c7fafaff834751d2c176", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16c2028b7ae0c7fafaff834751d2c176")).floatValue();
        }
        float f = com.sankuai.waimai.machpro.a.c.widthPixels;
        try {
            ((WindowManager) this.mMachContext.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
            return com.sankuai.waimai.machpro.util.b.a(displayMetrics.widthPixels);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
            return f;
        }
    }

    private float getScreenHeight() {
        DisplayMetrics displayMetrics;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a78d6e9f75d71e82dd4716fce00c6a78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a78d6e9f75d71e82dd4716fce00c6a78")).floatValue();
        }
        float f = com.sankuai.waimai.machpro.a.c.heightPixels;
        try {
            ((WindowManager) this.mMachContext.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
            return com.sankuai.waimai.machpro.util.b.a(displayMetrics.heightPixels);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
            return f;
        }
    }

    private float getWindowWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c47f18a10d9f8192d55623a60974bd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c47f18a10d9f8192d55623a60974bd0")).floatValue();
        }
        float f = com.sankuai.waimai.machpro.a.b.widthPixels;
        try {
            return com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext().getResources().getDisplayMetrics().widthPixels);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
            return f;
        }
    }

    private float getWindowHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab710479ed1f6cf12f9eccf82bc7a66f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab710479ed1f6cf12f9eccf82bc7a66f")).floatValue();
        }
        float f = com.sankuai.waimai.machpro.a.b.heightPixels;
        try {
            return com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext().getResources().getDisplayMetrics().heightPixels);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
            return f;
        }
    }
}
