package com.meituan.android.common.badge;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.badge.data.DBHelper;
import com.meituan.android.common.badge.data.Data;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.OneIdConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class DataOperator {
    private static final String BADGE_TYPE_APP = "app";
    private static final String BADGE_TYPE_BADGE = "badge";
    private static final String BADGE_TYPE_BASE = "base";
    private static final String BADGE_TYPE_HARDWARE = "hd";
    private static final String BADGE_TYPE_OS = "os";
    private static final char CATEGORY_SEPARATOR = '_';
    private static final String KEY_CUSTOMIZED_NORMAL = "customized_normal";
    private static final String KEY_CUSTOMIZED_URGENT = "customized_urgent";
    private static final String REGEX_PHONE = "[^0-9*]+";
    private static final String RSA_PUBLIC_KEY = "30820122300D06092A864886F70D01010105000382010F003082010A028201010084D94F3A93ECAAC97BDE1DBE68BCDBE49F5C14F4F08B5968E79AABD95EDDD50947B27AF656359327AA5C5C19AFB130BAEDD6D18870076756039D91912F5BF7FB6F6FD8252D463C64A7B28252F5AA1D010FB0138A49F2E91B9D535AAD7559336015FF30D77D57B0447E36426F584971F4633AC2837ABFAE7EDBDF3780008B14C78BEEB1FCCA962613F7C5A6B42FFC9F1E2B3282B54DAD028D858D39E27499A028368584021CFA39BFA2CD0E03E42863840F391BBCF63369DBB6BE7E1BFA6F7F3E4C1127E977DD71BEC019E4E06D419BDEE54114F38E04A9EB17D42C7658958F2EFB49D20CA615767E04094D7113F06E1EC2A0181FB8FA7215A07AB094915633B50203010001";
    private static final String TAG = "badge_do";
    private static final Map<String, BaseInfoProvider> baseInfoProviders = new HashMap();
    public static ChangeQuickRedirect changeQuickRedirect;
    private BadgeProducer producer;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface BaseInfoProvider {
        String val(BadgeProducer badgeProducer);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnDataPutListener {
        boolean onPut(String str, String str2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class CachedBaseInfoProvider implements BaseInfoProvider {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String val;

        public abstract String dynamicVal(BadgeProducer badgeProducer);

        public CachedBaseInfoProvider() {
        }

        @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
        public String val(BadgeProducer badgeProducer) {
            Object[] objArr = {badgeProducer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e0c2994b0a2bb376a629edcb352607", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e0c2994b0a2bb376a629edcb352607");
            }
            if (!TextUtils.isEmpty(this.val)) {
                return this.val;
            }
            this.val = dynamicVal(badgeProducer);
            return this.val;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class FinalBaseInfoProvider implements BaseInfoProvider {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String val;

        public FinalBaseInfoProvider(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b21c08fb5cf35b5e1dffdf31fe9e438c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b21c08fb5cf35b5e1dffdf31fe9e438c");
            } else {
                this.val = str;
            }
        }

        @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
        public String val(BadgeProducer badgeProducer) {
            return this.val;
        }
    }

    static {
        String str;
        try {
            registerBaseInfoProvider(BADGE_TYPE_BADGE, "id", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69283aa4aa9a1e1eacece670185af30e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69283aa4aa9a1e1eacece670185af30e") : BadgeEngine.id();
                }
            });
            registerBaseInfoProvider(BADGE_TYPE_BADGE, "version", new FinalBaseInfoProvider(BuildConfig.VERSION_NAME));
            registerBaseInfoProvider("os", "name", new FinalBaseInfoProvider("android"));
            registerBaseInfoProvider("os", "version", new FinalBaseInfoProvider(Build.VERSION.RELEASE));
            registerBaseInfoProvider("os", "level", new FinalBaseInfoProvider(String.valueOf(Build.VERSION.SDK_INT)));
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "manufacturer", new FinalBaseInfoProvider(Build.MANUFACTURER));
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "brand", new FinalBaseInfoProvider(Build.BRAND));
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "model", new FinalBaseInfoProvider(Build.MODEL));
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "hardware", new FinalBaseInfoProvider(Build.HARDWARE));
            if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr = Build.SUPPORTED_ABIS;
                StringBuilder sb = new StringBuilder();
                int i = 0;
                int length = strArr == null ? 0 : strArr.length;
                while (i < length) {
                    sb.append(i == 0 ? "" : CommonConstant.Symbol.COMMA);
                    sb.append(strArr[i]);
                    i++;
                }
                str = sb.toString();
            } else {
                str = Build.CPU_ABI;
            }
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "abi_list", new FinalBaseInfoProvider(str));
            registerBaseInfoProvider(BADGE_TYPE_HARDWARE, "pos_sn", new CachedBaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.CachedBaseInfoProvider
                public final String dynamicVal(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f7ad9218ac716343de35e586f3b15ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f7ad9218ac716343de35e586f3b15ed") : badgeProducer.posSN();
                }
            });
            registerBaseInfoProvider("app", "name", new CachedBaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.CachedBaseInfoProvider
                public final String dynamicVal(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53c0965b6930f05b7ff1481381ce375", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53c0965b6930f05b7ff1481381ce375") : BadgeEngine.sAppCtx.getPackageName();
                }
            });
            registerBaseInfoProvider("app", "version", new CachedBaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.CachedBaseInfoProvider
                public final String dynamicVal(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "910b22ce4148e2e7316a5a8204e567f0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "910b22ce4148e2e7316a5a8204e567f0");
                    }
                    try {
                        Application application = BadgeEngine.sAppCtx;
                        return application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                    } catch (Throwable th) {
                        BadgeEngine.error(DataOperator.TAG, new BadgeException(th));
                        return null;
                    }
                }
            });
            registerBaseInfoProvider("app", "channel", new CachedBaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.CachedBaseInfoProvider
                public final String dynamicVal(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12476b45fa698d08483e652b527a3e70", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12476b45fa698d08483e652b527a3e70") : badgeProducer.channel();
                }
            });
            registerBaseInfoProvider("app", "hash", new CachedBaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.CachedBaseInfoProvider
                public final String dynamicVal(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ccfbdd11dbc32023baeb1c240b655f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ccfbdd11dbc32023baeb1c240b655f7") : badgeProducer.appHash();
                }
            });
            registerBaseInfoProvider("base", "uuid", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8a68a64e7f1985784187fde8950bd1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8a68a64e7f1985784187fde8950bd1") : badgeProducer.uuId();
                }
            });
            registerBaseInfoProvider("base", OneIdConstants.ONEID, new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82382886d5e3b180c7c8785f4f3591e5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82382886d5e3b180c7c8785f4f3591e5") : badgeProducer.oneId();
                }
            });
            registerBaseInfoProvider("base", "dpid", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c46606dfd8558f9f939f08bade1ba4ff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c46606dfd8558f9f939f08bade1ba4ff") : badgeProducer.dpId();
                }
            });
            registerBaseInfoProvider("base", "unionid", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10d55da3b386f67dac6ba7d4cafd2f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10d55da3b386f67dac6ba7d4cafd2f8") : badgeProducer.unionId();
                }
            });
            registerBaseInfoProvider("base", "userid", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13c30bdfec94fc2cf4517f14acd6101e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13c30bdfec94fc2cf4517f14acd6101e") : badgeProducer.userId();
                }
            });
            registerBaseInfoProvider("base", "push_token", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452d4a3132dc93b77bba780cd2649edd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452d4a3132dc93b77bba780cd2649edd") : badgeProducer.pushToken();
                }
            });
            registerBaseInfoProvider("base", Constants.Environment.KEY_CITYID, new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a476ed4eadc81a41938fa0e67bbd8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a476ed4eadc81a41938fa0e67bbd8b") : badgeProducer.cityId();
                }
            });
            registerBaseInfoProvider("base", "dxid", new BaseInfoProvider() { // from class: com.meituan.android.common.badge.DataOperator.14
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.badge.DataOperator.BaseInfoProvider
                public final String val(BadgeProducer badgeProducer) {
                    Object[] objArr = {badgeProducer};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7d95854106fc11b45394d82902a5a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7d95854106fc11b45394d82902a5a6") : badgeProducer.dxId();
                }
            });
        } catch (Throwable th) {
            BadgeEngine.error(TAG, new BadgeException(th));
        }
    }

    private static void registerBaseInfoProvider(String str, String str2, BaseInfoProvider baseInfoProvider) {
        Object[] objArr = {str, str2, baseInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3abd5d7998eef380a02694a12cd3a1cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3abd5d7998eef380a02694a12cd3a1cb");
            return;
        }
        Map<String, BaseInfoProvider> map = baseInfoProviders;
        map.put(str + CATEGORY_SEPARATOR + str2, baseInfoProvider);
    }

    public DataOperator(BadgeProducer badgeProducer) {
        Object[] objArr = {badgeProducer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8828cf17569eeffe340a29a5cfb6fa0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8828cf17569eeffe340a29a5cfb6fa0e");
        } else {
            this.producer = badgeProducer;
        }
    }

    private ArrayList<Data.DataEntity> getHistoryInfo(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03364ce357f88c960050a2993bf86a30", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03364ce357f88c960050a2993bf86a30");
        }
        if (BadgeEngine.shouldLog(0)) {
            BadgeEngine.debug(TAG, "history query: " + str + " args: " + Arrays.asList(strArr));
        }
        ArrayList<Data.DataEntity> arrayList = new ArrayList<>();
        Cursor query = DBHelper.instance().getReadableDatabase().query("d", Data.sAllColumns, str, strArr, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(Data.asEntity(query));
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
        if (BadgeEngine.shouldLog(0)) {
            BadgeEngine.debug(TAG, "history entities: " + arrayList);
        }
        return arrayList;
    }

    private void putProducerBaseInfo(OnDataPutListener onDataPutListener) {
        Object[] objArr = {onDataPutListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124ce1b4e0cead9fbad076a91101d14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124ce1b4e0cead9fbad076a91101d14c");
            return;
        }
        for (Map.Entry<String, BaseInfoProvider> entry : baseInfoProviders.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue().val(this.producer);
            if (!TextUtils.isEmpty(val) && !onDataPutListener.onPut(key, val)) {
                return;
            }
        }
    }

    private void putProducerCustomizedUrgentInfo(OnDataPutListener onDataPutListener) {
        Map<String, String> urgentInfo;
        Object[] objArr = {onDataPutListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19314a44c707a232cb244f5ad8ac4a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19314a44c707a232cb244f5ad8ac4a7a");
            return;
        }
        List<CustomizedProvider> customizedInfo = this.producer.customizedInfo();
        int size = customizedInfo != null ? customizedInfo.size() : 0;
        for (int i = 0; i < size; i++) {
            CustomizedProvider customizedProvider = customizedInfo.get(i);
            String category = customizedProvider.category();
            if (!TextUtils.isEmpty(category) && (urgentInfo = customizedProvider.urgentInfo()) != null && !urgentInfo.isEmpty()) {
                String str = category + CATEGORY_SEPARATOR;
                for (Map.Entry<String, String> entry : urgentInfo.entrySet()) {
                    String str2 = str + entry.getKey();
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value) || onDataPutListener.onPut(str2, value)) {
                    }
                }
            }
        }
    }

    private void putProducerCustomizedNormalInfo(OnDataPutListener onDataPutListener) {
        Map<String, String> normalInfo;
        Object[] objArr = {onDataPutListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bb461938168d641a5b60d97d20ca0a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bb461938168d641a5b60d97d20ca0a5");
            return;
        }
        List<CustomizedProvider> customizedInfo = this.producer.customizedInfo();
        int size = customizedInfo != null ? customizedInfo.size() : 0;
        for (int i = 0; i < size; i++) {
            CustomizedProvider customizedProvider = customizedInfo.get(i);
            String category = customizedProvider.category();
            if (!TextUtils.isEmpty(category) && (normalInfo = customizedProvider.normalInfo()) != null && !normalInfo.isEmpty()) {
                String str = category + CATEGORY_SEPARATOR;
                for (Map.Entry<String, String> entry : normalInfo.entrySet()) {
                    String str2 = str + entry.getKey();
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value) || onDataPutListener.onPut(str2, value)) {
                    }
                }
            }
        }
    }

    public final boolean hasUrgentInfoUpdated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25e866c9a55e0002bf7b1bbeb3a1590f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25e866c9a55e0002bf7b1bbeb3a1590f")).booleanValue();
        }
        final ArrayList<Data.DataEntity> historyInfo = getHistoryInfo("f&2", new String[0]);
        if (historyInfo.isEmpty()) {
            return true;
        }
        final boolean[] zArr = {false};
        OnDataPutListener onDataPutListener = new OnDataPutListener() { // from class: com.meituan.android.common.badge.DataOperator.15
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.badge.DataOperator.OnDataPutListener
            public boolean onPut(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "11f8fdaf39c05bbf5dcbbc7bd0a64685", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "11f8fdaf39c05bbf5dcbbc7bd0a64685")).booleanValue();
                }
                Data.DataEntity dataEntity = null;
                int size = historyInfo.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Data.DataEntity dataEntity2 = (Data.DataEntity) historyInfo.get(i);
                    if (str.equals(dataEntity2.key)) {
                        dataEntity = dataEntity2;
                        break;
                    }
                    i++;
                }
                if (dataEntity == null || !TextUtils.equals(dataEntity.val, str2)) {
                    zArr[0] = true;
                    if (BadgeEngine.shouldLog(2)) {
                        BadgeEngine.warn(DataOperator.TAG, str + " changed to: " + str2);
                    }
                    return false;
                }
                return true;
            }
        };
        putProducerBaseInfo(onDataPutListener);
        if (!zArr[0]) {
            putProducerCustomizedUrgentInfo(onDataPutListener);
        }
        return zArr[0];
    }

    public final Map<String, String> persistAndGet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94d9097f1c028bd4c3d81f769a237b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94d9097f1c028bd4c3d81f769a237b7");
        }
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final HashMap hashMap3 = new HashMap();
        final ArrayList arrayList = new ArrayList();
        ArrayList<Data.DataEntity> historyInfo = getHistoryInfo(null, new String[0]);
        int size = historyInfo.size();
        for (int i = 0; i < size; i++) {
            Data.DataEntity dataEntity = historyInfo.get(i);
            if (dataEntity.isBase) {
                hashMap.put(dataEntity.key, dataEntity.val);
            } else if (dataEntity.isUrgent) {
                hashMap2.put(dataEntity.key, dataEntity.val);
            } else {
                hashMap3.put(dataEntity.key, dataEntity.val);
            }
        }
        putProducerBaseInfo(new OnDataPutListener() { // from class: com.meituan.android.common.badge.DataOperator.16
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.badge.DataOperator.OnDataPutListener
            public boolean onPut(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56e0e2d7c2a72a82f16dca706deb26fe", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56e0e2d7c2a72a82f16dca706deb26fe")).booleanValue();
                }
                hashMap.put(str, str2);
                Data.DataEntity dataEntity2 = new Data.DataEntity();
                dataEntity2.key = str;
                dataEntity2.val = str2;
                dataEntity2.isBase = true;
                dataEntity2.isUrgent = true;
                arrayList.add(Data.asContentValue(dataEntity2));
                return true;
            }
        });
        putProducerCustomizedUrgentInfo(new OnDataPutListener() { // from class: com.meituan.android.common.badge.DataOperator.17
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.badge.DataOperator.OnDataPutListener
            public boolean onPut(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9f864eb5fa13f14c645af7dcfce9ea1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9f864eb5fa13f14c645af7dcfce9ea1")).booleanValue();
                }
                hashMap2.put(str, str2);
                Data.DataEntity dataEntity2 = new Data.DataEntity();
                dataEntity2.key = str;
                dataEntity2.val = str2;
                dataEntity2.isBase = false;
                dataEntity2.isUrgent = true;
                arrayList.add(Data.asContentValue(dataEntity2));
                return true;
            }
        });
        if (hashMap2.size() > 0) {
            hashMap.put(KEY_CUSTOMIZED_URGENT, new JSONObject(hashMap2).toString());
        }
        putProducerCustomizedNormalInfo(new OnDataPutListener() { // from class: com.meituan.android.common.badge.DataOperator.18
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.badge.DataOperator.OnDataPutListener
            public boolean onPut(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6789708ba3e9b482ec723e415e1643a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6789708ba3e9b482ec723e415e1643a0")).booleanValue();
                }
                hashMap3.put(str, str2);
                Data.DataEntity dataEntity2 = new Data.DataEntity();
                dataEntity2.key = str;
                dataEntity2.val = str2;
                dataEntity2.isBase = false;
                dataEntity2.isUrgent = false;
                arrayList.add(Data.asContentValue(dataEntity2));
                return true;
            }
        });
        if (hashMap3.size() > 0) {
            hashMap.put(KEY_CUSTOMIZED_NORMAL, new JSONObject(hashMap3).toString());
        }
        SQLiteDatabase writableDatabase = DBHelper.instance().getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                writableDatabase.insertWithOnConflict("d", null, (ContentValues) arrayList.get(i2), 5);
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            try {
                return hashMap;
            } finally {
            }
        }
        return hashMap;
    }
}
