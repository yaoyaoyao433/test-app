package com.sankuai.waimai.guidepop.hign;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.cipstorage.q;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.guidepop.hign.GuidePopHighBean;
import com.sankuai.waimai.guidepop.utils.c;
import com.sankuai.waimai.guidepop.utils.e;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final q b;
    final List<AlertInfo> c;
    final GuidePopHighBean.Frequency d;
    final a e;
    int f;
    private final Activity g;
    private View h;
    private String i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public b(@NonNull Activity activity, @NonNull List<AlertInfo> list, @Nullable GuidePopHighBean.Frequency frequency, @Nullable a aVar) {
        Object[] objArr = {activity, list, frequency, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9521aaa50a91e02169df96f4f44ab0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9521aaa50a91e02169df96f4f44ab0c");
            return;
        }
        this.f = 0;
        this.g = activity;
        this.c = list;
        this.d = frequency;
        this.e = aVar;
        this.b = q.a(activity.getApplicationContext(), "wm_guide_pop_high", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738c344981aeec74c0aabaf6fcd56732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738c344981aeec74c0aabaf6fcd56732");
        } else {
            new com.sankuai.waimai.guidepop.hign.a("c_m84bv26").a(this.g, alertInfo, this.h, new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.guidepop.hign.b.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e07c96bece55c161b70f7f8f5ce51535", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e07c96bece55c161b70f7f8f5ce51535");
                    } else if (b.this.e != null) {
                        b.this.e.a();
                    }
                }
            }, new com.sankuai.waimai.platform.mach.dialog.b() { // from class: com.sankuai.waimai.guidepop.hign.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f9856424e36400d1d9d532479f043ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f9856424e36400d1d9d532479f043ba");
                        return;
                    }
                    b bVar = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a6561c6ac3e941ea2ac200d6772e9f6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a6561c6ac3e941ea2ac200d6772e9f6d");
                        return;
                    }
                    e.a("guide_pop_high_WMGuidePopHighTask", "[saveFrequency]");
                    if (bVar.d == null || TextUtils.isEmpty(bVar.d.frequencyKey)) {
                        return;
                    }
                    String str = bVar.d.frequencyKey;
                    q qVar = bVar.b;
                    int b = qVar.b(str + "_use_count", 0);
                    q qVar2 = bVar.b;
                    qVar2.a(str + "_use_count", b + 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49515d25942dd1a8ebcefe7d2f2aaf1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49515d25942dd1a8ebcefe7d2f2aaf1f");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.guidepop.hign.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "186509de76daac78217d57c97c68fe56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "186509de76daac78217d57c97c68fe56");
                        return;
                    }
                    b.this.f++;
                    e.a("guide_pop_high_WMGuidePopHighTask", "[showDelay tryTimes:]" + b.this.f);
                    AlertInfo c = b.this.c();
                    if (c != null) {
                        b.this.a(c);
                    } else if (b.this.f < 4) {
                        b.this.a();
                    } else {
                        if (b.this.e != null) {
                            b.this.e.a();
                        }
                        e.a("GuidePopAnchorRenderTimeout", Float.valueOf(1.0f), b.this.b());
                    }
                }
            }, 500, "GUIDE_POP_HIGH_WAIT_TASK");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d30f8c572c7a1310c1b02b200ce0ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d30f8c572c7a1310c1b02b200ce0ee");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "1");
        hashMap.put("location_flag", this.i);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlertInfo c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d12721e257c70aeb7780e11ad0f3381", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d12721e257c70aeb7780e11ad0f3381");
        }
        for (AlertInfo alertInfo : this.c) {
            if (alertInfo != null && b(alertInfo)) {
                return alertInfo;
            }
        }
        return null;
    }

    private boolean b(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30439dc89f29b0b093c417587ab86586", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30439dc89f29b0b093c417587ab86586")).booleanValue();
        }
        String c = c(alertInfo);
        e.a("guide_pop_high_WMGuidePopHighTask", "[isTargetViewShow] targetViewKey：" + c);
        this.i = c;
        this.h = a(c);
        boolean a2 = c.a(this.h);
        if (!a2) {
            e.a("GuidePopAnchorNoFind", Float.valueOf(1.0f), b());
        }
        return a2;
    }

    private View a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4eea9e1f730603a79ec0a1d3b750e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4eea9e1f730603a79ec0a1d3b750e9");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.sankuai.waimai.guidepop.manager.b.a().a(str);
    }

    private String c(AlertInfo alertInfo) {
        Object[] objArr = {alertInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bae0ebf675df689ebccf5fea2dc373", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bae0ebf675df689ebccf5fea2dc373");
        }
        try {
            Map map = (Map) alertInfo.extraData.get(PayLabelConstants.TYPE_POINT);
            Map map2 = (Map) map.get("match");
            String str = (String) ((Map) map.get("path")).get("view_id");
            String str2 = (String) map2.get(JsBridgeResult.ARG_KEY_LOCATION_MODE);
            Map map3 = (Map) map2.get("info");
            if ("dsp_resource".equals(str2)) {
                return str + "@" + ((Number) map3.get("resource_id")).intValue();
            } else if (PushConstants.INTENT_ACTIVITY_NAME.equals(str2)) {
                return str + "@" + ((String) map3.get("id"));
            } else if ("text".equals(str2)) {
                return str + "@" + ((String) map3.get("text"));
            } else {
                return null;
            }
        } catch (Exception e) {
            e.a("guide_pop_high_WMGuidePopHighTask", "[getTargetViewKey]" + e.getMessage());
            return null;
        }
    }
}
