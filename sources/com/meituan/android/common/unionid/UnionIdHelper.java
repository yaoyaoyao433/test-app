package com.meituan.android.common.unionid;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.AbsNetworkHandler;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class UnionIdHelper {
    private static final String TAG_LOG = HttpNetworkHandler.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context sContext;
    private static Handler sHandler;

    public static void updateUnionIdToAll(Context context, String str) {
    }

    public static void init(Context context, Handler handler) {
        sContext = context;
        sHandler = handler;
    }

    private static void callbackUnionId(final String str, List<IUnionIdCallback> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03c6e4773bccf9f4eec503b929bcfeb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03c6e4773bccf9f4eec503b929bcfeb3");
        } else if (list != null && list.size() != 0 && sHandler != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                final IUnionIdCallback iUnionIdCallback = list.get(i);
                sHandler.post(new Runnable() { // from class: com.meituan.android.common.unionid.UnionIdHelper.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60c43c13cc96b284484a6bb22fd4808f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60c43c13cc96b284484a6bb22fd4808f");
                        } else if (IUnionIdCallback.this != null) {
                            IUnionIdCallback.this.onCall(str);
                        }
                    }
                });
            }
            list.clear();
        }
    }

    public static void findUnionId(IEnvironment iEnvironment, AbsNetworkHandler absNetworkHandler, List<IUnionIdCallback> list) {
        Object[] objArr = {iEnvironment, absNetworkHandler, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51631f779f20c0723289d6846c482c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51631f779f20c0723289d6846c482c56");
        } else if (iEnvironment == null || absNetworkHandler == null || list == null) {
        } else {
            try {
                String unionIdByShared = getUnionIdByShared(sContext);
                if (!TextUtils.isEmpty(unionIdByShared)) {
                    callbackUnionId(unionIdByShared, list);
                } else if (TextUtils.isEmpty(unionIdByShared)) {
                    String unionIdBySdcard = getUnionIdBySdcard();
                    if (TextUtils.isEmpty(unionIdBySdcard)) {
                        registerUnionId(iEnvironment, absNetworkHandler, list);
                        return;
                    }
                    callbackUnionId(unionIdBySdcard, list);
                    saveUnionIdToShared(sContext, unionIdBySdcard);
                } else {
                    callbackUnionId(unionIdByShared, list);
                    saveUnionIdToShared(sContext, unionIdByShared);
                    saveUnionIdToSdcard(unionIdByShared);
                }
            } catch (Exception e) {
                callbackUnionId(null, list);
                String str = TAG_LOG;
                Log.e(str, "findUnionId is error:" + e.getMessage(), e);
            }
        }
    }

    private static void registerUnionId(IEnvironment iEnvironment, AbsNetworkHandler absNetworkHandler, List<IUnionIdCallback> list) throws Exception {
        Object[] objArr = {iEnvironment, absNetworkHandler, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1b3afc12f1b3fc7f2d4cd686a8e602d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1b3afc12f1b3fc7f2d4cd686a8e602d");
        } else if (iEnvironment == null || absNetworkHandler == null || list == null) {
            throw new Exception("registerUnionId params is null");
        }
    }

    public static void checkUnionId(IEnvironment iEnvironment, AbsNetworkHandler absNetworkHandler) throws Exception {
        final boolean z = false;
        Object[] objArr = {iEnvironment, absNetworkHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c6eeb36ad9f124c6c44c8a3ad262d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c6eeb36ad9f124c6c44c8a3ad262d88");
            return;
        }
        final String unionIdByShared = getUnionIdByShared(sContext);
        if (TextUtils.isEmpty(unionIdByShared)) {
            unionIdByShared = getUnionIdBySdcard();
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(unionIdByShared)) {
            return;
        }
        if (iEnvironment != null && absNetworkHandler != null && !TextUtils.isEmpty(unionIdByShared)) {
            HashMap hashMap = new HashMap();
            hashMap.put("unionid", unionIdByShared);
            try {
                absNetworkHandler.sendRequest(Constants.GENERATE_URL, hashMap, new AbsNetworkHandler.INetworkCallback() { // from class: com.meituan.android.common.unionid.UnionIdHelper.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.unionid.AbsNetworkHandler.INetworkCallback
                    public final void success(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "78fcc6669f37108d65108dadbc8eccd4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "78fcc6669f37108d65108dadbc8eccd4");
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            if (!unionIdByShared.equals(str)) {
                                UnionIdHelper.saveUnionIdToShared(UnionIdHelper.sContext, str);
                                UnionIdHelper.saveUnionIdToSdcard(str);
                                UnionIdHelper.updateUnionIdToAll(UnionIdHelper.sContext, str);
                            }
                            if (z) {
                                UnionIdHelper.saveUnionIdToSdcard(unionIdByShared);
                            }
                        }
                    }
                });
                return;
            } catch (Exception e) {
                String str = TAG_LOG;
                Log.e(str, "checkUnionId is error:" + e.getMessage(), e);
                return;
            }
        }
        throw new Exception("checkUnionId params is null");
    }

    public static String getUnionIdFromLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da1ce45e1701dcad73a7f3b1c4b8995d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da1ce45e1701dcad73a7f3b1c4b8995d") : getUnionIdFromLocal(context, null);
    }

    public static String getUnionIdFromLocal(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c8c2b5d42e13654760cf07729cc4bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c8c2b5d42e13654760cf07729cc4bfb");
        }
        String unionIdByShared = getUnionIdByShared(context, statUtil);
        return TextUtils.isEmpty(unionIdByShared) ? getUnionIdBySdcard(context, statUtil) : unionIdByShared;
    }

    public static void saveUnionIdToLocal(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17bf90eec0085f38a030dbb95315c8e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17bf90eec0085f38a030dbb95315c8e8");
            return;
        }
        saveUnionIdToSdcard(str);
        saveUnionIdToShared(context, str);
    }

    public static void saveUnionIdToSdcard(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc13b88de68504d6c2e4acb58ebcfac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc13b88de68504d6c2e4acb58ebcfac0");
            return;
        }
        MonitorManager.addEvent("unionId", 140, true, MonitorManager.getMsg(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            UnionIdStorage.saveUnionIdToSdcard(SimpleCrypto.encrypt(str, SimpleCrypto.initKey()));
            MonitorManager.addEvent("unionId", 140, false, (JSONObject) null);
        } catch (Exception e) {
            String str2 = TAG_LOG;
            Log.e(str2, "saveUnionIdToSdcard is error:" + e.getMessage(), e);
            MonitorManager.addEvent("unionId", 140, false, MonitorManager.getExceptionMsg(e.getMessage()));
        }
    }

    public static void saveUnionIdToShared(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2dc695725f2b3d8be7c7c78727ccc1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2dc695725f2b3d8be7c7c78727ccc1d");
            return;
        }
        MonitorManager.addEvent("unionId", 139, true, MonitorManager.getMsg(str));
        if (context == null && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (UnionIdSharedPref.getInstance(context).setUnionId(SimpleCrypto.encrypt(str, SimpleCrypto.initKey()))) {
                MonitorManager.addEvent("unionId", 139, false, (JSONObject) null);
            } else {
                MonitorManager.addEvent("unionId", 139, false, MonitorManager.getExceptionMsg("unkonwn"));
            }
        } catch (Exception e) {
            String str2 = TAG_LOG;
            Log.e(str2, "saveUnionIdToShared is error:" + e.getMessage(), e);
            MonitorManager.addEvent("unionId", 139, false, MonitorManager.getExceptionMsg(e.getMessage()));
        }
    }

    public static String getUnionIdBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57ffda3297d51d5c6fa7bb7fa6676232", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57ffda3297d51d5c6fa7bb7fa6676232") : getUnionIdBySdcard(null, null);
    }

    public static String getUnionIdBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "634aa281fea68493af67f84a2699c8f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "634aa281fea68493af67f84a2699c8f8");
        }
        MonitorManager.addEvent(statUtil, "unionId", 131, true);
        try {
            String unionIdBySdcard = UnionIdStorage.getUnionIdBySdcard(context, statUtil);
            if (!TextUtils.isEmpty(unionIdBySdcard)) {
                String decrypt = SimpleCrypto.decrypt(unionIdBySdcard, SimpleCrypto.initKey());
                if (statUtil != null) {
                    statUtil.markStat("unionId", 131, MonitorManager.getMsg(decrypt));
                }
                return decrypt;
            }
        } catch (Throwable th) {
            String str = TAG_LOG;
            Log.e(str, "getUnionIdBySdcard is error:" + th.getMessage(), th);
            if (statUtil != null && !(th instanceof IOException) && !(th instanceof SecurityException)) {
                statUtil.markStat("unionId", 131, MonitorManager.getMsg(4, null, th.getMessage()));
            }
        }
        MonitorManager.addEvent(statUtil, "unionId", 131, false);
        return null;
    }

    public static String getUnionIdByShared(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4472d99296d7ba606a09f280154a771c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4472d99296d7ba606a09f280154a771c") : getUnionIdByShared(context, null);
    }

    public static String getUnionIdByShared(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2c166933d8c317620f0b877543119e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2c166933d8c317620f0b877543119e0");
        }
        MonitorManager.addEvent(statUtil, "unionId", 130, true);
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("unionId", 130, MonitorManager.getMsg(11, null, MonitorManager.CONTEXT_IS_NULL_MSG));
            }
            return null;
        }
        try {
            String unionId = UnionIdSharedPref.getInstance(context).getUnionId();
            if (!TextUtils.isEmpty(unionId)) {
                String decrypt = SimpleCrypto.decrypt(unionId, SimpleCrypto.initKey());
                if (statUtil != null) {
                    statUtil.markStat("unionId", 130, MonitorManager.getMsg(decrypt));
                }
                return decrypt;
            }
        } catch (Throwable th) {
            String str = TAG_LOG;
            Log.e(str, "getUnionIdByShared is error:" + th.getMessage(), th);
            if (statUtil != null) {
                statUtil.markStat("unionId", 130, MonitorManager.getMsg(12, null, th.getMessage()));
            }
        }
        MonitorManager.addEvent(statUtil, "unionId", 130, false);
        return null;
    }
}
