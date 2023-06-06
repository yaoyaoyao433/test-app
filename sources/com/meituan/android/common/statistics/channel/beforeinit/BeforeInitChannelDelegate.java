package com.meituan.android.common.statistics.channel.beforeinit;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.channel.IChannelInterface;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.channel.beforeinit.BeforeInitLxEventData;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BeforeInitChannelDelegate implements IChannelInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String mChannelName;

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean createTagContainer(Object obj, Activity activity) {
        return true;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, String> getAllEnvironment() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public String getEnvironment() {
        return "";
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public String getEnvironment(String str) {
        return "";
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public long getSeq() {
        return 0L;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, Object> getTag(String str) {
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void registerTag(String... strArr) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str, String str2) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str, String str2) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateTag(String str, String str2, Map<String, Object> map) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateTag(String str, Map<String, Object> map) {
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void write(String str, EventInfo eventInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(EventInfo eventInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5, boolean z) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(String str) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull String str, EventInfo eventInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull String str, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IMMPInterface
    public void writeEventThroughMMP(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IKNBInterface
    public void writeEventThroughWeb(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3) {
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4) {
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writePageTrack(BusinessInfo businessInfo) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writePageTrack(String str, String str2) {
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeShow(@NonNull String str, String str2, Map<String, Object> map, String str3, String str4) {
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeShow(String str, Map<String, Object> map, String str2, String str3) {
    }

    public BeforeInitChannelDelegate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b4f939e92c57efe86f17fcdaae7c45e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b4f939e92c57efe86f17fcdaae7c45e");
        } else {
            this.mChannelName = str;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeAutoPageView(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50b57f9620e3a20a52d6a9be1cc2b39e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50b57f9620e3a20a52d6a9be1cc2b39e");
        } else {
            writeAutoPageView((String) null, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeAutoPageView(Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1355008ae77348c2b6576479438e68b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1355008ae77348c2b6576479438e68b8");
        } else {
            writeAutoPageView(null, map, eventLevel);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writePageView(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cfa9c143e1b7d034465c0c7b221e94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cfa9c143e1b7d034465c0c7b221e94");
        } else {
            writePageView(null, str, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writePageDisappear(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7064a44fc51ab5508b95ab37f0d50eb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7064a44fc51ab5508b95ab37f0d50eb9");
        } else {
            writePageDisappear(null, null, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writePageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd3a7a56e6bafdf33ba1344a6ff5f47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd3a7a56e6bafdf33ba1344a6ff5f47");
        } else {
            writePageDisappear(str, "", map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "471c71a79da58b93915b49bdfbf5e0d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "471c71a79da58b93915b49bdfbf5e0d9");
        } else {
            writeModelView((String) null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f28460fff14345f7d548671f477e2e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f28460fff14345f7d548671f477e2e8");
        } else {
            writeModelView(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, Map<String, Object> map, int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f44c185fa0a43456dc35d7e0a457770a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f44c185fa0a43456dc35d7e0a457770a");
        } else {
            writeModelView((String) null, str, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d9d10b8bfce63bc8d789ca26471be8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d9d10b8bfce63bc8d789ca26471be8");
        } else {
            writeModelView(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, Map<String, Object> map, String str2, int i) {
        Object[] objArr = {str, map, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80516ccfad44d6174d53bf07d26fe6e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80516ccfad44d6174d53bf07d26fe6e3");
        } else {
            writeModelView((String) null, str, map, str2, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6dcc647a5572a08e7408bb4bd392828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6dcc647a5572a08e7408bb4bd392828");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.MODEL_VIEW, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setIndex(i).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "663ea93dc96370f350c31f67f1771e35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "663ea93dc96370f350c31f67f1771e35");
        } else {
            writeModelView((String) null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelEdit(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "082a42ca815183c184d082bbc479fe7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "082a42ca815183c184d082bbc479fe7c");
        } else {
            writeModelEdit(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6793bff996566cfa71ab8aef15bbdfdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6793bff996566cfa71ab8aef15bbdfdb");
        } else {
            writeModelEdit(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelEdit(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbe0388311d2f0e8c863d5a2d547201c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbe0388311d2f0e8c863d5a2d547201c");
        } else {
            writeModelEdit(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public String getChannelName() {
        return this.mChannelName;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccd9edf740651b2591c45d725e0f6f38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccd9edf740651b2591c45d725e0f6f38");
        } else {
            writeAutoPageView(str, map, EventLevel.URGENT);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageView(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c13a3b3ec79466d43edd8a6d322ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c13a3b3ec79466d43edd8a6d322ff3");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.PAGE_VIEW, this.mChannelName, str).setCid(str2).setValLab(map).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageDisappear(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "710eb3cb512c21e6d8bd31b70f0e6a84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "710eb3cb512c21e6d8bd31b70f0e6a84");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.PAGE_DISAPPEAR, this.mChannelName, str).setCid(str2).setValLab(map).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db77a5257a3b7ab2738390c071dc74aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db77a5257a3b7ab2738390c071dc74aa");
        } else {
            writeModelView(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "594d18b7908c08761a710d76924b6106", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "594d18b7908c08761a710d76924b6106");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.MODEL_VIEW, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setWithPageInfo(z).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb1dd735ad7adcd897edfeee7c4f3245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb1dd735ad7adcd897edfeee7c4f3245");
        } else {
            writeModelEdit(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123953107d4774921820f51b17af6c1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123953107d4774921820f51b17af6c1a");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.EDIT, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setWithPageInfo(z).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77ae7aa7a7b78f5532480edbae57d88f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77ae7aa7a7b78f5532480edbae57d88f");
        } else {
            writeModelClick(str, str2, map, str3, false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f7a97494fcd1238d64b8cd4998461a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f7a97494fcd1238d64b8cd4998461a5");
        } else {
            writeModelClick(str, str2, map, str3, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "384f15cd5385959e3e1655337824e081", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "384f15cd5385959e3e1655337824e081");
        } else {
            writeBizOrder(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976df9c64148359423919fe3dd2268b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "976df9c64148359423919fe3dd2268b6");
        } else {
            writeBizPay(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81848fb1975b5b4d4e0fa304eb1284f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81848fb1975b5b4d4e0fa304eb1284f");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.SC, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(String str, Map<String, Object> map, int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11fbfe716c7b63cb04e589b8deed459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11fbfe716c7b63cb04e589b8deed459");
        } else {
            writeModelClick((String) null, str, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f21867bba36862a2089cb21bc235c3cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f21867bba36862a2089cb21bc235c3cb");
        } else {
            writeModelClick(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(String str, Map<String, Object> map, String str2, int i) {
        Object[] objArr = {str, map, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1e4d6b12491bf6d2b65e371cab45bdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1e4d6b12491bf6d2b65e371cab45bdb");
        } else {
            writeModelClick((String) null, str, map, str2, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1418875aeafd182c7013280afc4bb091", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1418875aeafd182c7013280afc4bb091");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.CLICK, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setIndex(i).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9502ad6c7fee6497ab5b95f9e304c654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9502ad6c7fee6497ab5b95f9e304c654");
        } else {
            writeModelClick(null, str, map, "", false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21525ddfa944ce141a99579c8e828308", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21525ddfa944ce141a99579c8e828308");
        } else {
            writeModelClick(str, str2, map, "", false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e81320f461c87cd08aa6ff30282d8d8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e81320f461c87cd08aa6ff30282d8d8e");
        } else {
            writeModelClick(null, str, map, str2, false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03e65d432eea7ba4ff393a03c299a854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03e65d432eea7ba4ff393a03c299a854");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.CLICK, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setWithPageInfo(z).setSf(z2).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45500fe17bc876f13bd727733f60e83a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45500fe17bc876f13bd727733f60e83a");
        } else {
            writeBizOrder(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b6672240c32b13c6998efb30b0c0079", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b6672240c32b13c6998efb30b0c0079");
        } else {
            writeBizOrder(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2bcae307315fb65a89ac1f1c67fdab4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2bcae307315fb65a89ac1f1c67fdab4");
        } else {
            writeBizOrder(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "466052af39e0297398013fa03e0fe8ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "466052af39e0297398013fa03e0fe8ac");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.ORDER, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setWithPageInfo(z).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94911dcf1c61d056064531109675a8fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94911dcf1c61d056064531109675a8fa");
        } else {
            writeBizPay(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81c84680b7a2ce37558475abe74f9d9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81c84680b7a2ce37558475abe74f9d9a");
        } else {
            writeBizPay(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae2f4d22831fc7f602406c5ea7fddaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae2f4d22831fc7f602406c5ea7fddaa");
        } else {
            writeBizPay(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9ae2299c12c3c9c74784a9c70095c89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9ae2299c12c3c9c74784a9c70095c89");
        } else {
            BeforeInitChannelManager.getInstance().saveBeforeInitLxEventData(new BeforeInitLxEventData.Builder(EventName.PAY, this.mChannelName, str).setBid(str2).setValLab(map).setCid(str3).setWithPageInfo(z).build());
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d37881be56339ad5b841838aa067d953", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d37881be56339ad5b841838aa067d953");
        } else {
            writeSystemCheck(str, str2, map, "");
        }
    }
}
