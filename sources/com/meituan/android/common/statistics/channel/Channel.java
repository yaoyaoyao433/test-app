package com.meituan.android.common.statistics.channel;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Channel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IChannelInterface mChannelDelegate;

    public Channel(String str, ChannelManager channelManager, Context context) {
        Object[] objArr = {str, channelManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e326a5b4b4b034f65fc2108140f8326", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e326a5b4b4b034f65fc2108140f8326");
        } else {
            this.mChannelDelegate = ChannelCreator.selectChannel(context, channelManager, str);
        }
    }

    public Channel(String str, ChannelManager channelManager, Context context, boolean z) {
        Object[] objArr = {str, channelManager, context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f8e0b4d854774ec4042ea6953b5a925", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f8e0b4d854774ec4042ea6953b5a925");
        } else {
            this.mChannelDelegate = new RemoteChannelProxy(str, channelManager, context);
        }
    }

    public Channel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9739ba756e7b642ca0fd28468b33613b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9739ba756e7b642ca0fd28468b33613b");
        }
    }

    public String getChannelName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2f8c4a18f9e864d14956b421396576a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2f8c4a18f9e864d14956b421396576a") : this.mChannelDelegate.getChannelName();
    }

    public boolean updateEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a094cc87e95560e5bb2c573b41d06b22", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a094cc87e95560e5bb2c573b41d06b22")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.i("statistics", "Channel - updateEnvironment: parameters property can not be empty.");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.i("statistics", "Channel - updateEnvironment: parameters value can not be empty.");
            return false;
        } else {
            return this.mChannelDelegate.updateEnvironment(str, str2);
        }
    }

    public boolean updateEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67b5942ce2a07b297d947e4e50ae6f02", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67b5942ce2a07b297d947e4e50ae6f02")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.i("statistics", "Channel - updateEnvironment: parameters can not be empty");
            return false;
        }
        return this.mChannelDelegate.updateEnvironment(str);
    }

    public Map<String, String> getAllEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74834bfaf11c0d0c1150d1ae16fc5f96", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74834bfaf11c0d0c1150d1ae16fc5f96") : this.mChannelDelegate.getAllEnvironment();
    }

    public boolean createTagContainer(Object obj, Activity activity) {
        Object[] objArr = {obj, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85c6cd175c6ebafd56ac0efac65e5007", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85c6cd175c6ebafd56ac0efac65e5007")).booleanValue();
        }
        if (obj == null || activity == null || !((obj instanceof Fragment) || (obj instanceof android.support.v4.app.Fragment))) {
            return false;
        }
        this.mChannelDelegate.createTagContainer(obj, activity);
        return true;
    }

    public boolean updateTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7dcb38d8a1cb042d4500347cfa15220", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7dcb38d8a1cb042d4500347cfa15220")).booleanValue() : this.mChannelDelegate.updateTag(str, map);
    }

    public boolean updateTag(Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39061c6b007f4986be794c773b199e64", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39061c6b007f4986be794c773b199e64")).booleanValue();
        }
        if (str == null || (obj != null && !(obj instanceof Activity) && !(obj instanceof Fragment) && !(obj instanceof android.support.v4.app.Fragment))) {
            LogUtil.i("statistics", "Channel - updateTag: parameters property can not be empty.");
            return false;
        }
        return this.mChannelDelegate.updateTag(AppUtil.generatePageInfoKey(obj), str, map);
    }

    public void registerTag(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca5c2eb9585a9602a06141448fe855c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca5c2eb9585a9602a06141448fe855c8");
        } else if (strArr == null || strArr.length == 0) {
            LogUtil.i("statistics", "Channel - registerTag: parameters can not be empty.");
        } else {
            this.mChannelDelegate.registerTag(strArr);
        }
    }

    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483037e96d8154d47a98a065986daa1e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483037e96d8154d47a98a065986daa1e")).booleanValue() : removeTag(null, str);
    }

    public boolean removeTag(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a75d0cb5f7278c659670bccc2159db6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a75d0cb5f7278c659670bccc2159db6")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (obj != null && !(obj instanceof Activity) && !(obj instanceof Fragment) && !(obj instanceof android.support.v4.app.Fragment))) {
            LogUtil.i("statistics", "Channel - removeTag: parameters property can not be empty.");
            return false;
        }
        return this.mChannelDelegate.removeTag(AppUtil.generatePageInfoKey(obj), str);
    }

    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92198c1aa85be2704de60485c1db5671", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92198c1aa85be2704de60485c1db5671");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mChannelDelegate.getTag(str);
    }

    public void writeAutoPageView(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d272d5357730d8ee6811058515211a81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d272d5357730d8ee6811058515211a81");
        } else {
            writeAutoPageView(str, map, EventLevel.URGENT);
        }
    }

    public void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {str, map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1afd456ab34b3485497c8c8a59f71d75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1afd456ab34b3485497c8c8a59f71d75");
        } else {
            this.mChannelDelegate.writeAutoPageView(str, map, eventLevel);
        }
    }

    public void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e89653d61c394b91ffdc68c179cf1959", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e89653d61c394b91ffdc68c179cf1959");
        } else {
            this.mChannelDelegate.writeAutoPageDisappear(str, map);
        }
    }

    public void writePageView(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7b5af9f1b8300321229679321fd6d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7b5af9f1b8300321229679321fd6d2");
        } else {
            this.mChannelDelegate.writePageView(str, str2, map);
        }
    }

    public void writePageDisappear(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "170c11fd032440b2322baffd42b5f5f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "170c11fd032440b2322baffd42b5f5f6");
        } else {
            this.mChannelDelegate.writePageDisappear(str, str2, map);
        }
    }

    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39caf2cb4b1492b98bad2d402783f330", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39caf2cb4b1492b98bad2d402783f330");
        } else {
            writeModelView(str, str2, map, "", false);
        }
    }

    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be864394e4a17886ec449c8b6fb3e4d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be864394e4a17886ec449c8b6fb3e4d5");
        } else {
            writeModelView(str, str2, map, "", i);
        }
    }

    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d39fe20f737147d265d26bd41ff46c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d39fe20f737147d265d26bd41ff46c");
        } else {
            this.mChannelDelegate.writeModelView(str, str2, map, str3, i);
        }
    }

    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19c0b8cf147c06b35b39609182c1e133", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19c0b8cf147c06b35b39609182c1e133");
        } else {
            writeModelView(str, str2, map, str3, false);
        }
    }

    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "822a19c8c1777d72ee2fe9e5c82d651b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "822a19c8c1777d72ee2fe9e5c82d651b");
        } else {
            this.mChannelDelegate.writeModelView(str, str2, map, str3, z);
        }
    }

    public void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87cdd9728e8c79b3305361185b08c56c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87cdd9728e8c79b3305361185b08c56c");
        } else {
            this.mChannelDelegate.writeModeViewMergable(str, str2, map, str3);
        }
    }

    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cf19bb628380258be75f7e0001e4b58", 6917529027641081856L) ? (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cf19bb628380258be75f7e0001e4b58") : this.mChannelDelegate.writeModelExposure(str, str2, map, str3);
    }

    public ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8318204dae02d7b5956254301cd0adc8", 6917529027641081856L) ? (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8318204dae02d7b5956254301cd0adc8") : this.mChannelDelegate.writeModelExposureForMrnSDk(str, str2, map, str3, str4);
    }

    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d76b3af0f6afc291c225ba314de17a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d76b3af0f6afc291c225ba314de17a4");
        } else {
            writeModelEdit(str, str2, map, "", false);
        }
    }

    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d78904a0b1beefb91296dbc0a9c4256", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d78904a0b1beefb91296dbc0a9c4256");
        } else {
            writeModelEdit(str, str2, map, str3, false);
        }
    }

    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e19b0486cdf5538c790fdba2b27df9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e19b0486cdf5538c790fdba2b27df9");
        } else {
            this.mChannelDelegate.writeModelEdit(str, str2, map, str3, z);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e38b262f25a0ba0a2fb5cc2e7f4af4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e38b262f25a0ba0a2fb5cc2e7f4af4");
        } else {
            writeModelClick(str, str2, map, "", i);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94172f5edaa1feea6f27326f939d7a65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94172f5edaa1feea6f27326f939d7a65");
        } else {
            this.mChannelDelegate.writeModelClick(str, str2, map, str3, i);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "701fb0558c5ee33dcfce595a6d3c36be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "701fb0558c5ee33dcfce595a6d3c36be");
        } else {
            writeModelClick(str, str2, map, "", false);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd05dd8ef174440315bea95fbd5e2eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd05dd8ef174440315bea95fbd5e2eb");
        } else {
            writeModelClick(str, str2, map, str3, false);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ea07522f64493fc51208e4ef71a6557", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ea07522f64493fc51208e4ef71a6557");
        } else {
            writeModelClick(str, str2, map, str3, z, false);
        }
    }

    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ffa5eb9c43d9d7afb7d2e745d29051", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ffa5eb9c43d9d7afb7d2e745d29051");
        } else {
            this.mChannelDelegate.writeModelClick(str, str2, map, str3, z, z2);
        }
    }

    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0474391376c75e66072bf67d0a1d510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0474391376c75e66072bf67d0a1d510");
        } else {
            writeBizOrder(str, str2, map, "", false);
        }
    }

    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d5f750e09be2f97ac91b6f2fbc5961", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d5f750e09be2f97ac91b6f2fbc5961");
        } else {
            writeBizOrder(str, str2, map, str3, false);
        }
    }

    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8c5a3a755ba021c006fcfdae83dedf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8c5a3a755ba021c006fcfdae83dedf");
        } else {
            this.mChannelDelegate.writeBizOrder(str, str2, map, str3, z);
        }
    }

    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d013cdc2d24436192537f0c39df9007b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d013cdc2d24436192537f0c39df9007b");
        } else {
            writeBizPay(str, str2, map, "", false);
        }
    }

    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2314cb3a4413a6a5c093a61d920fb6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2314cb3a4413a6a5c093a61d920fb6d8");
        } else {
            writeBizPay(str, str2, map, str3, false);
        }
    }

    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4df49d4717d2b670e647d153707381", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4df49d4717d2b670e647d153707381");
        } else {
            this.mChannelDelegate.writeBizPay(str, str2, map, str3, z);
        }
    }

    public void writeShow(@NonNull String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "260f23d2025508df6eab8117e3e894e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "260f23d2025508df6eab8117e3e894e2");
        } else {
            this.mChannelDelegate.writeShow(str, str2, map, str3, str4);
        }
    }

    public void writeSystemCheck(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21a3e87e8a44452dba53a83c8daea677", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21a3e87e8a44452dba53a83c8daea677");
        } else {
            writeSystemCheck(str, str2, map, "");
        }
    }

    public void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e16f4ab76cb2112f5ad698da85f638f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e16f4ab76cb2112f5ad698da85f638f");
        } else {
            this.mChannelDelegate.writeSystemCheck(str, str2, map, str3);
        }
    }

    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
        Object[] objArr = {str, str2, map, str3, eventName, midasInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afd1ce6eb35320c0c9f0a639b439241d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afd1ce6eb35320c0c9f0a639b439241d");
        } else {
            this.mChannelDelegate.writeAdEvent(str, str2, map, str3, eventName, midasInfo, z);
        }
    }

    public void writeEvent(@NonNull String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "674c55fb2e53edd2901515b8a22dc5bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "674c55fb2e53edd2901515b8a22dc5bd");
            return;
        }
        StringBuilder sb = new StringBuilder("writeEvent pageInfoKey:");
        sb.append(str);
        sb.append(" eventInfo:");
        sb.append(eventInfo != null ? eventInfo.toString() : "eventInfo null");
        LogUtil.log("lxsdk", sb.toString());
        if (eventInfo == null) {
            LogUtil.i("statistics", "Channel - writeEvent New: eventInfo is null.");
        } else {
            this.mChannelDelegate.writeEvent(str, eventInfo);
        }
    }

    public void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, eventName, businessInfo, map, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a44a025525c264a3e56e9505e4e6faa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a44a025525c264a3e56e9505e4e6faa0");
        } else if (eventName == null) {
            LogUtil.i("statistics", "Channel - writeEvent New: nm is null.");
        } else {
            this.mChannelDelegate.writeEvent(str, eventName, businessInfo, map, str2, str3, str4, str5, str6);
        }
    }

    public void writeEvent(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419be3cf6124f5004b52fef9f48ae37b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419be3cf6124f5004b52fef9f48ae37b");
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.i("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            this.mChannelDelegate.writeEvent(str, str2);
        }
    }

    public void write(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "341c15591256d34f47d008dfa431e764", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "341c15591256d34f47d008dfa431e764");
        } else {
            this.mChannelDelegate.write(str, eventInfo);
        }
    }

    public void writeEventThroughWeb(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "958b47c3fe56328ba731d46d12a9b2f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "958b47c3fe56328ba731d46d12a9b2f0");
        } else {
            this.mChannelDelegate.writeEventThroughWeb(jSONObject, jSONObject2);
        }
    }

    public void writeEventThroughMMP(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4b10553f7cb064845d47927e59fc8d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4b10553f7cb064845d47927e59fc8d4");
        } else {
            this.mChannelDelegate.writeEventThroughMMP(jSONObject, jSONObject2);
        }
    }

    public long getSeq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f193187eb5733a768755cde89d7c917a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f193187eb5733a768755cde89d7c917a")).longValue() : this.mChannelDelegate.getSeq();
    }

    @Deprecated
    public void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z) {
        Object[] objArr = {queue, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ac2c8b4fea5f2e3d06e4256f051ecce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ac2c8b4fea5f2e3d06e4256f051ecce");
        } else {
            this.mChannelDelegate.reportCacheEventListAfterPv(queue, jSONObject, z);
        }
    }

    @Deprecated
    public String getEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46a45c914ea3653f963af9ad83aea782", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46a45c914ea3653f963af9ad83aea782") : TextUtils.isEmpty(str) ? "" : this.mChannelDelegate.getEnvironment(str);
    }

    @Deprecated
    public String getEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32170ca08d7245dcc90f9cbb67a01dc4", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32170ca08d7245dcc90f9cbb67a01dc4") : this.mChannelDelegate.getEnvironment();
    }

    @Deprecated
    public void writeEvent(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7576849337b4fc1712d59ac0ea69fe65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7576849337b4fc1712d59ac0ea69fe65");
        } else {
            writeEvent((String) null, eventInfo);
        }
    }

    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5da89e99b940166e75448c8b2590260b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5da89e99b940166e75448c8b2590260b");
        } else {
            writeModelClick((String) null, str, map, str2, false);
        }
    }

    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e797b388a196401c9cee92317b37c2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e797b388a196401c9cee92317b37c2d");
        } else {
            writeModelView((String) null, str, map, str2, false);
        }
    }

    @Deprecated
    public void writeBizPay(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a100c3de6663dbe0beb1814b6c62ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a100c3de6663dbe0beb1814b6c62ac");
        } else {
            writeBizPay(null, str, map, str2, false);
        }
    }

    @Deprecated
    public void writeBizOrder(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a6e01561546f3bf91a35cd40e122c5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a6e01561546f3bf91a35cd40e122c5a");
        } else {
            writeBizOrder(null, str, map, str2, false);
        }
    }
}
