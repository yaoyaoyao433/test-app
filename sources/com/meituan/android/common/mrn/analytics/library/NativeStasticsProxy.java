package com.meituan.android.common.mrn.analytics.library;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeStasticsProxy implements INStasticsInterface {
    public static final String MODULE_NAME = "Statistics";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static NativeStasticsProxy mSingleton;

    public String getName() {
        return MODULE_NAME;
    }

    public static NativeStasticsProxy getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6647ed0c743753ba20aaaf831f1d4ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeStasticsProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6647ed0c743753ba20aaaf831f1d4ee1");
        }
        if (mSingleton == null) {
            synchronized (NativeStasticsProxy.class) {
                if (mSingleton == null) {
                    mSingleton = new NativeStasticsProxy();
                }
            }
        }
        return mSingleton;
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void pageView(String str, String str2, String str3, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4c006a7408f4a1d971988fd953d5522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4c006a7408f4a1d971988fd953d5522");
        } else {
            getChannelByName(str2).writePageView(str, str3, hashMap);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void pageDisappear(String str, String str2, String str3, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96139ac83946b2490192c688d2556af5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96139ac83946b2490192c688d2556af5");
        } else {
            getChannelByName(str2).writePageDisappear(str, str3, hashMap);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void moduleClick(String str, String str2, String str3, String str4, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6156f5c65290a2c345ed41a8462481a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6156f5c65290a2c345ed41a8462481a2");
        } else {
            getChannelByName(str2).writeModelClick(str, str3, hashMap, str4);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void moduleView(String str, String str2, String str3, String str4, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8110ccb89b94dfa328e88c1de33b3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8110ccb89b94dfa328e88c1de33b3c3");
        } else {
            getChannelByName(str2).writeModelView(str, str3, hashMap, str4);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void moduleEdit(String str, String str2, String str3, String str4, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a31295c5997ee708a579ef1cea5044c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a31295c5997ee708a579ef1cea5044c2");
        } else {
            getChannelByName(str2).writeModelEdit(str, str3, hashMap, str4);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void moduleViewList(String str, String str2, String str3, String str4, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a205064ee14b8f911d2e2d2e6cfd5e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a205064ee14b8f911d2e2d2e6cfd5e22");
        } else {
            getChannelByName(str2).writeModeViewMergable(str, str3, hashMap, str4);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void pay(String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, str5, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6840ab08d4d404428ba8840f4ad8645c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6840ab08d4d404428ba8840f4ad8645c");
            return;
        }
        Channel channelByName = getChannelByName(str2);
        if (hashMap != null && !TextUtils.isEmpty(str5)) {
            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, str5);
        }
        channelByName.writeBizPay(str, str3, hashMap, str4);
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void order(String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, str5, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cca7826c18f9131c03fdfddf65f631c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cca7826c18f9131c03fdfddf65f631c1");
            return;
        }
        Channel channelByName = getChannelByName(str2);
        if (hashMap != null && !TextUtils.isEmpty(str5)) {
            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, str5);
        }
        channelByName.writeBizOrder(str, str3, hashMap, str4);
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void systemCheck(String str, String str2, String str3, String str4, HashMap hashMap) {
        Object[] objArr = {str, str2, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5a5e6f31133bc17fc440203f37a5ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5a5e6f31133bc17fc440203f37a5ca8");
        } else {
            getChannelByName(str2).writeSystemCheck(str, str3, hashMap, str4);
        }
    }

    @Override // com.meituan.android.common.mrn.analytics.library.INStasticsInterface
    public void setTag(String str, ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b76521278af0c37707ee60260b669d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b76521278af0c37707ee60260b669d95");
        } else {
            Statistics.getChannel().updateTag(str, convertToMap(readableMap));
        }
    }

    private Channel getChannelByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3be0e43631b51639f233bc4f17193d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Channel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3be0e43631b51639f233bc4f17193d5a");
        }
        if (TextUtils.isEmpty(str)) {
            return Statistics.getChannel();
        }
        return Statistics.getChannel(str);
    }

    private static HashMap<String, Object> convertToMap(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1acf0b2a6970d25680e326bb8a26f819", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1acf0b2a6970d25680e326bb8a26f819");
        }
        if (readableMap == null) {
            return new HashMap<>();
        }
        return readableMap.toHashMap();
    }

    public static HashMap<String, Object> getMapFromRN(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf65a529297036f6ccffa2627392d268", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf65a529297036f6ccffa2627392d268");
        }
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        addMRNSign(hashMap);
        addNt(hashMap);
        return hashMap;
    }

    private static void addMRNSign(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        HashMap hashMap2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "107c69daeabefde7928ab0de07b86c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "107c69daeabefde7928ab0de07b86c0f");
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable unused) {
                return;
            }
        }
        if (hashMap.containsKey("mrnInfo")) {
            Object obj = hashMap.get("mrnInfo");
            if (obj instanceof HashMap) {
                hashMap2 = (HashMap) obj;
            }
        } else {
            hashMap2 = new HashMap();
            hashMap.put("mrnInfo", hashMap2);
        }
        if (hashMap2 != null) {
            hashMap2.put("from_lxmrn", "1");
            hashMap2.put("from_lxmrn_nt", BuildConfig.LX_MRN_VERSION_NAME);
        }
    }

    private static HashMap<String, Object> addNt(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "691617dab6a422c77869f331912d18be", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "691617dab6a422c77869f331912d18be");
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("nt", 10);
        return hashMap;
    }

    public void moduleExposure(String str, String str2, String str3, String str4, String str5, String str6, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3a3979cd9ce2551a13c070febd98a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3a3979cd9ce2551a13c070febd98a7d");
            return;
        }
        ExposureInfo exposureInfo = ExposureInfoMrnCache.getInstance().getExposureInfo(str5, str6);
        if (exposureInfo != null) {
            exposureInfo.mv();
        } else {
            ExposureInfoMrnCache.getInstance().addExposureInfo(str5, str6, getChannelByName(str2).writeModelExposureForMrnSDk(str, str3, hashMap, str4, str6));
        }
    }

    public void moduleDisappear(String str, String str2, long j, long j2, int i) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d6d12ccfb74def9f446b6b2f3ee74ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d6d12ccfb74def9f446b6b2f3ee74ab");
            return;
        }
        ExposureInfo exposureInfo = ExposureInfoMrnCache.getInstance().getExposureInfo(str, str2);
        if (exposureInfo != null) {
            exposureInfo.mrnModelDisappear(j, j2, i);
        }
    }

    public void mrnContainerReleased(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b164e44b3908471935ae802da3a2958f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b164e44b3908471935ae802da3a2958f");
        } else {
            ExposureInfoMrnCache.getInstance().clearCache(str);
        }
    }
}
