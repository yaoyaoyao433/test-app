package com.sankuai.waimai.platform.capacity.abtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.annotation.RouterProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ABTestManager implements IABTestService {
    private static final String CAT_TAG_EXP = "exp_name";
    private static final String CAT_TAG_GROUP = "group_name";
    public static final String SP_FILE_NAME = "waimai_abtest_strategies";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SuppressLint({"StaticFieldLeak"})
    private static ABTestManager sInstance;
    private final Context mContext;
    private q sp;

    public ABTestManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c44e69eada865e9bfe3b6889fbc4339", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c44e69eada865e9bfe3b6889fbc4339");
            return;
        }
        this.sp = null;
        this.mContext = context.getApplicationContext();
    }

    public static ABTestManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6532c2e405ee3cf54207fc33bc45dd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABTestManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6532c2e405ee3cf54207fc33bc45dd8");
        }
        if (sInstance == null) {
            synchronized (ABTestManager.class) {
                if (sInstance == null) {
                    sInstance = new ABTestManager(context);
                }
            }
        }
        return sInstance;
    }

    @Override // com.sankuai.waimai.foundation.core.service.abtest.IABTestService
    public ABStrategy getStrategy(String str, ABStrategy aBStrategy) {
        Object[] objArr = {str, aBStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48cce3d4c2745d631966d52c449e2049", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48cce3d4c2745d631966d52c449e2049");
        }
        if (!TextUtils.isEmpty(str)) {
            String b = sp().b(str, (String) null);
            if (!TextUtils.isEmpty(b)) {
                aBStrategy = ABStrategy.fromJson(b);
            }
        }
        abStrategyCatCustomReport(aBStrategy);
        return aBStrategy;
    }

    public void onUpdateStrategiesFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da0f32bc914c31e514dcbde8df4d3669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da0f32bc914c31e514dcbde8df4d3669");
        } else {
            updateStrategiesInternal(null);
        }
    }

    public void onUpdateStrategiesSuccess(ABTestExpStrategyResponse aBTestExpStrategyResponse) {
        Object[] objArr = {aBTestExpStrategyResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22441844f5bdc6ddcca2ffec770b5f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22441844f5bdc6ddcca2ffec770b5f6a");
        } else {
            updateStrategiesInternal(aBTestExpStrategyResponse == null ? null : aBTestExpStrategyResponse.b);
        }
    }

    public void onUpdateStrategiesSuccess(@Nullable List<ABStrategy> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9dc7d970bf90f0db6f764b5a1bc9128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9dc7d970bf90f0db6f764b5a1bc9128");
        } else {
            updateStrategiesInternal(list);
        }
    }

    private void updateStrategiesInternal(@Nullable final List<ABStrategy> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad9cbf83ea31772a63050885528d3f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad9cbf83ea31772a63050885528d3f29");
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.platform.capacity.abtest.ABTestManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0498143ca1d117261bf2d7c9d72734bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0498143ca1d117261bf2d7c9d72734bb");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    q sp = ABTestManager.this.sp();
                    for (Map.Entry<String, ?> entry : sp.b().entrySet()) {
                        String key = entry.getKey();
                        ABStrategy parseStrategy = ABTestManager.this.parseStrategy(entry.getValue());
                        if (parseStrategy != null && !TextUtils.isEmpty(parseStrategy.groupName) && !TextUtils.isEmpty(parseStrategy.expName)) {
                            parseStrategy.isLast = false;
                            hashMap.put(key, parseStrategy);
                        }
                    }
                    if (list != null && !list.isEmpty()) {
                        for (ABStrategy aBStrategy : list) {
                            if (aBStrategy != null && !TextUtils.isEmpty(aBStrategy.groupName) && !TextUtils.isEmpty(aBStrategy.expName)) {
                                aBStrategy.isLast = true;
                                hashMap.put(aBStrategy.groupName, aBStrategy);
                            }
                        }
                    }
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        sp.a((String) entry2.getKey(), ((ABStrategy) entry2.getValue()).toString());
                    }
                }
            }, (String) null);
        }
    }

    public String readAllStrategies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c9142e3740d6ddf4c1b6ef492498414", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c9142e3740d6ddf4c1b6ef492498414");
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, ?> entry : sp().b().entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("\n\n");
            }
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(String.valueOf(entry.getValue()));
        }
        return sb.toString();
    }

    public void clearAllStrategies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91859e6f3b0b5d0408b46dd0f2d4ea19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91859e6f3b0b5d0408b46dd0f2d4ea19");
        } else {
            sp().h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ABStrategy parseStrategy(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbe833ca7fa66f787f334a882bc7cec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbe833ca7fa66f787f334a882bc7cec5");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return ABStrategy.fromJson(str);
        }
        return null;
    }

    public void updateStrategy(String str, ABStrategy aBStrategy) {
        boolean z = false;
        Object[] objArr = {str, aBStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78596d4b14c61ff14b65656f771b2c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78596d4b14c61ff14b65656f771b2c88");
        } else if (TextUtils.isEmpty(str) || aBStrategy == null || TextUtils.isEmpty(aBStrategy.expName)) {
        } else {
            ABStrategy strategy = getStrategy(str, null);
            if (strategy != null && aBStrategy.expName.equals(strategy.expName)) {
                z = true;
            }
            aBStrategy.isLast = z;
            writeStrategy(str, aBStrategy);
        }
    }

    private void writeStrategy(String str, ABStrategy aBStrategy) {
        Object[] objArr = {str, aBStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15646bad9c9e64ea6308834b7c2eba00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15646bad9c9e64ea6308834b7c2eba00");
        } else if (TextUtils.isEmpty(str) || aBStrategy == null) {
        } else {
            sp().a(str, aBStrategy.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q sp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f76c7ea70579efab7a6e6dbe1497f3dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f76c7ea70579efab7a6e6dbe1497f3dc");
        }
        if (this.sp == null) {
            this.sp = q.a(this.mContext, SP_FILE_NAME, 1);
        }
        return this.sp;
    }

    public static void abStrategyCatCustomReport(ABStrategy aBStrategy) {
        Object[] objArr = {aBStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f580019cbfdeb46d70fd675538f44e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f580019cbfdeb46d70fd675538f44e01");
        } else if (aBStrategy == null || TextUtils.isEmpty(aBStrategy.groupName) || TextUtils.isEmpty(aBStrategy.expName)) {
        } else {
            m mVar = new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c());
            mVar.a(getCatKey(), Collections.singletonList(Float.valueOf(1.0f)));
            mVar.a(CAT_TAG_GROUP, aBStrategy.groupName);
            mVar.a(CAT_TAG_EXP, aBStrategy.expName);
            mVar.a();
        }
    }

    private static String getCatKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07698b321ebe66f84324da3d17fc1706", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07698b321ebe66f84324da3d17fc1706") : com.sankuai.waimai.platform.net.c.a().c() ? "WMABTest_Test" : "WMABTest";
    }

    @RouterProvider
    public static ABTestManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14772035d19fe212bfb94818b381c5eb", RobustBitConfig.DEFAULT_VALUE) ? (ABTestManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14772035d19fe212bfb94818b381c5eb") : getInstance(com.meituan.android.singleton.b.a);
    }
}
