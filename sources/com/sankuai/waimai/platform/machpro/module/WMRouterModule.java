package com.sankuai.waimai.platform.machpro.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRouterModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int sRequestCode = 10;
    private MPJSCallBack mActivityResultCallback;

    public WMRouterModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2748f47f19208d732af8d9e9dd80ca80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2748f47f19208d732af8d9e9dd80ca80");
        }
    }

    @JSMethod(methodName = "navigateTo")
    public void navigateTo(String str, MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Context context;
        Object[] objArr = {str, machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b37bd6d7094ec285dbbfd8091ce96cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b37bd6d7094ec285dbbfd8091ce96cd7");
        } else if (TextUtils.isEmpty(str)) {
            MachMap machMap2 = new MachMap();
            machMap2.put("code", 0);
            machMap2.put("message", "uri is empty");
            MachMap machMap3 = new MachMap();
            machMap3.put("error", machMap2);
            machMap3.put("success", Boolean.FALSE);
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap3);
            }
        } else {
            if (getMachContext() != null && getMachContext().getContext() != null) {
                context = getMachContext().getContext();
            } else {
                context = b.a;
            }
            a.C0950a a = a.a();
            if (machMap != null) {
                a.a(com.sankuai.waimai.machpro.util.b.a(machMap));
            }
            a.a(new e() { // from class: com.sankuai.waimai.platform.machpro.module.WMRouterModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0acd70eb8ad66a4ab48c5a7784299f6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0acd70eb8ad66a4ab48c5a7784299f6a");
                        return;
                    }
                    MachMap machMap4 = new MachMap();
                    machMap4.put("error", null);
                    machMap4.put("success", Boolean.TRUE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap4);
                    }
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar, int i) {
                    Object[] objArr2 = {jVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "618c6d10f921dfce4018ddbc0ee49d2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "618c6d10f921dfce4018ddbc0ee49d2b");
                        return;
                    }
                    MachMap machMap4 = new MachMap();
                    machMap4.put("code", Integer.valueOf(i));
                    machMap4.put("message", "");
                    MachMap machMap5 = new MachMap();
                    machMap5.put("error", machMap4);
                    machMap5.put("success", Boolean.FALSE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap5);
                    }
                }
            }).a(context, str);
        }
    }

    @JSMethod(methodName = "navigateToForResult")
    public void navigateToForResult(String str, MachMap machMap, MPJSCallBack mPJSCallBack) {
        Context context;
        Object[] objArr = {str, machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1f47c19599307d148930d9bdb9a1750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1f47c19599307d148930d9bdb9a1750");
        } else if (TextUtils.isEmpty(str)) {
            MachMap machMap2 = new MachMap();
            machMap2.put("code", 0);
            machMap2.put("message", "uri is empty");
            MachMap machMap3 = new MachMap();
            machMap3.put("error", machMap2);
            machMap3.put("success", Boolean.FALSE);
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap3);
            }
        } else {
            this.mActivityResultCallback = mPJSCallBack;
            if (getMachContext() != null && getMachContext().getContext() != null) {
                context = getMachContext().getContext();
            } else {
                context = b.a;
            }
            a.C0950a a = a.a();
            if (machMap != null) {
                a.a(com.sankuai.waimai.machpro.util.b.a(machMap));
            }
            sRequestCode++;
            a.a(sRequestCode);
            a.a(context, str);
        }
    }

    public void onActivityResult(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6018fc6b20b1a6f58846b763352ced15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6018fc6b20b1a6f58846b763352ced15");
        } else if (intent == null || this.mActivityResultCallback == null) {
        } else {
            MachMap machMap = new MachMap();
            machMap.put(Constant.KEY_RESULT_CODE, Integer.valueOf(f.a(intent, Constant.KEY_RESULT_CODE, 0)));
            machMap.put("resultData", f.a(intent, "resultData"));
            this.mActivityResultCallback.invoke(machMap);
            this.mActivityResultCallback = null;
        }
    }

    @JSMethod(methodName = "navigateBack")
    public void navigateBack(MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d14fdadc28b0b1cf9ea952bcfabe8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d14fdadc28b0b1cf9ea952bcfabe8c4");
            return;
        }
        MPContext machContext = getMachContext();
        if (machContext != null && (machContext.getContext() instanceof Activity)) {
            ((Activity) machContext.getContext()).finish();
            if (mPJSCallBack != null) {
                MachMap machMap = new MachMap();
                machMap.put("success", Boolean.TRUE);
                mPJSCallBack.invoke(machMap);
            }
        } else if (mPJSCallBack != null) {
            MachMap machMap2 = new MachMap();
            machMap2.put("code", -1);
            machMap2.put("message", "Activity is finished!");
            MachMap machMap3 = new MachMap();
            machMap3.put("error", machMap2);
            mPJSCallBack.invoke(machMap3);
        }
    }
}
