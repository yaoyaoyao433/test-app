package com.sankuai.waimai.platform.machpro.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.a;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMEventCenter extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int sListenerId;
    private boolean isRegistered;
    private Map<Integer, MPJSCallBack> mCallbackById;
    private Map<String, List<Integer>> mIdsByEventName;
    private BroadcastReceiver machReceiver;

    public WMEventCenter(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a28d6c51d02b7b95bcc7bfbdb13bb6d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a28d6c51d02b7b95bcc7bfbdb13bb6d2");
            return;
        }
        this.mIdsByEventName = new HashMap();
        this.mCallbackById = new HashMap();
        this.machReceiver = new BroadcastReceiver() { // from class: com.sankuai.waimai.platform.machpro.module.WMEventCenter.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb9e45afa318cba9f1f5948a1097d8ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb9e45afa318cba9f1f5948a1097d8ae");
                    return;
                }
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                List<Integer> list = (List) WMEventCenter.this.mIdsByEventName.get(action);
                if (b.b(list)) {
                    return;
                }
                MachMap machMap = new MachMap();
                if (intent.getBundleExtra("data") != null) {
                    machMap = b.a(intent.getBundleExtra("data"));
                } else {
                    String a2 = f.a(intent, "data");
                    if (!TextUtils.isEmpty(a2)) {
                        machMap.put("data", a2);
                    }
                }
                for (Integer num : list) {
                    MPJSCallBack mPJSCallBack = (MPJSCallBack) WMEventCenter.this.mCallbackById.get(num);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap);
                    }
                }
            }
        };
        mPContext.getInstance().a(new com.sankuai.waimai.machpro.instance.b() { // from class: com.sankuai.waimai.platform.machpro.module.WMEventCenter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.instance.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdeb44eee495c525fd2d39b5eae77057", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdeb44eee495c525fd2d39b5eae77057");
                    return;
                }
                super.a();
                try {
                    if (!WMEventCenter.this.isRegistered || WMEventCenter.this.getMachContext() == null) {
                        return;
                    }
                    WMEventCenter.this.getMachContext().getContext().unregisterReceiver(WMEventCenter.this.machReceiver);
                    WMEventCenter.this.getMachContext().getInstance().b(this);
                } catch (Exception e) {
                    a.a(e.getMessage());
                }
            }
        });
    }

    @JSMethod(methodName = "addListener")
    public Integer addListener(String str, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d749ce5f0bae6040eee35ac4d80b2ba7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d749ce5f0bae6040eee35ac4d80b2ba7");
        }
        if (TextUtils.isEmpty(str) || mPJSCallBack == null || getMachContext() == null) {
            return -1;
        }
        sListenerId++;
        this.mCallbackById.put(Integer.valueOf(sListenerId), mPJSCallBack);
        List<Integer> list = this.mIdsByEventName.get(str);
        if (list == null) {
            list = new LinkedList<>();
            getMachContext().getContext().registerReceiver(this.machReceiver, new IntentFilter(str));
            this.isRegistered = true;
        }
        list.add(Integer.valueOf(sListenerId));
        this.mIdsByEventName.put(str, list);
        return Integer.valueOf(sListenerId);
    }

    @JSMethod(methodName = "removeListener")
    public void removeListener(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c54855beac3ed94c2543cad3b2b954a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c54855beac3ed94c2543cad3b2b954a");
            return;
        }
        this.mCallbackById.remove(num);
        for (List<Integer> list : this.mIdsByEventName.values()) {
            if (list != null && list.contains(num)) {
                list.remove(num);
                return;
            }
        }
    }

    @JSMethod(methodName = "emit")
    public void emit(String str, MachMap machMap) {
        MPContext machContext;
        Bundle a;
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d5cc309f5b7422a48bfeae9bf1be504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d5cc309f5b7422a48bfeae9bf1be504");
        } else if (TextUtils.isEmpty(str) || (machContext = getMachContext()) == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction(str);
            if (machMap != null && (a = b.a(machMap)) != null) {
                intent.putExtra("data", a);
            }
            com.sankuai.meituan.takeoutnew.util.aop.b.a(machContext.getContext(), intent);
        }
    }
}
