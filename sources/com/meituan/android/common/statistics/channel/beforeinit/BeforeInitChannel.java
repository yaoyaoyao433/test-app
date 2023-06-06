package com.meituan.android.common.statistics.channel.beforeinit;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.channel.IChannelInterface;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BeforeInitChannel extends Channel {
    private static final String TAG = "BeforeInitChannel";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IChannelInterface mBeforeInitChannelDelegate;

    public BeforeInitChannel(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419d657a2853144ea769b510102626a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419d657a2853144ea769b510102626a1");
        } else {
            this.mBeforeInitChannelDelegate = new BeforeInitChannelDelegate(str);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public String getChannelName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a4906ad5832f33343ddded8e0dc7ab6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a4906ad5832f33343ddded8e0dc7ab6") : this.mBeforeInitChannelDelegate != null ? this.mBeforeInitChannelDelegate.getChannelName() : "unknown";
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean updateEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e6135c927b2d6ed91004eebddc93e9a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e6135c927b2d6ed91004eebddc93e9a")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).updateEnvironment(str, str2);
        }
        LogUtil.log(TAG, "LX before init don't support updateEnvironment()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean updateEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d681546854a2ca2e19124bb5bdc2a56f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d681546854a2ca2e19124bb5bdc2a56f")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).updateEnvironment(str);
        }
        LogUtil.log(TAG, "LX before init don't support updateEnvironment()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public Map<String, String> getAllEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e1107afcf64870989c97abf477a4b2", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e1107afcf64870989c97abf477a4b2");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).getAllEnvironment();
        }
        LogUtil.log(TAG, "don't support getAllEnvironment()");
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean createTagContainer(Object obj, Activity activity) {
        Object[] objArr = {obj, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eed42bbe00b93bb77cc0e82b8d3038c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eed42bbe00b93bb77cc0e82b8d3038c")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).createTagContainer(obj, activity);
        }
        LogUtil.log(TAG, "LX before init don't support createTagContainer()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean updateTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf772aa16a40fddf4e0422caeaa8f0bd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf772aa16a40fddf4e0422caeaa8f0bd")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).updateTag(str, map);
        }
        LogUtil.log(TAG, "LX before init don't support updateTag()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean updateTag(Object obj, String str, Map<String, Object> map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cc214cbfbe7193dbee24dc0fd1cb225", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cc214cbfbe7193dbee24dc0fd1cb225")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).updateTag(obj, str, map);
        }
        LogUtil.log(TAG, "LX before init don't support updateTag()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void registerTag(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d38f212abf4b6f19ac0910525d78fb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d38f212abf4b6f19ac0910525d78fb9");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).registerTag(strArr);
        } else {
            LogUtil.log(TAG, "LX before init don't support registerTag()");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a25c2bc172e4c294daf171e096fd03f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a25c2bc172e4c294daf171e096fd03f")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).removeTag(str);
        }
        LogUtil.log(TAG, "LX before init don't support removeTag()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public boolean removeTag(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97ca75806f9f6f735b5aa60f5157532f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97ca75806f9f6f735b5aa60f5157532f")).booleanValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).removeTag(obj, str);
        }
        LogUtil.log(TAG, "LX before init don't support removeTag()");
        return false;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5da69241cab8011f6d2bdc66239672e2", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5da69241cab8011f6d2bdc66239672e2");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).getTag(str);
        }
        LogUtil.log(TAG, "LX before init don't support getTag()");
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fbc0f094dfec858db439e338038050e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fbc0f094dfec858db439e338038050e");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeAutoPageView(str, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {str, map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4048342b7787ea193e010ed653075963", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4048342b7787ea193e010ed653075963");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeAutoPageView(str, map, eventLevel);
        } else {
            LogUtil.log(TAG, "LX before init don't support writeAutoPageView()");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b049dc567c76697fee1c22ddb632215d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b049dc567c76697fee1c22ddb632215d");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeAutoPageDisappear(str, map);
        } else {
            LogUtil.log(TAG, "LX before init don't support writeAutoPageDisappear()");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writePageView(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "871c271892261f97b6e6c2e7f7f9b713", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "871c271892261f97b6e6c2e7f7f9b713");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writePageView(), is already initialized!");
            Statistics.getChannel(getChannelName()).writePageView(str, str2, map);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writePageView(str, str2, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writePageDisappear(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d40e1045623121792a4214d99e1f5b58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d40e1045623121792a4214d99e1f5b58");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writePageDisappear(), is already initialized!");
            Statistics.getChannel(getChannelName()).writePageDisappear(str, str2, map);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writePageDisappear(str, str2, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f680e79bc1b812cadc8455dfd822b4b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f680e79bc1b812cadc8455dfd822b4b3");
        } else {
            writeModelView(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eec56960fc358ce24cf15349a035a18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eec56960fc358ce24cf15349a035a18");
        } else {
            writeModelView(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "059fb103072b278f1db01f49855982eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "059fb103072b278f1db01f49855982eb");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeModelView(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeModelView(str, str2, map, str3, i);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeModelView(str, str2, map, str3, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb4267256179fb2a7a95eed1f48bf057", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb4267256179fb2a7a95eed1f48bf057");
        } else {
            writeModelView(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edc64a3bcb7cb86fb541e6ec0c97b4ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edc64a3bcb7cb86fb541e6ec0c97b4ac");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeModelView(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeModelView(str, str2, map, str3, z);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeModelView(str, str2, map, str3, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61468f62f6776636d6d8f0955f401923", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61468f62f6776636d6d8f0955f401923");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeModeViewMergable(str, str2, map, str3);
        } else {
            LogUtil.log(TAG, "LX before init don't support writeModeViewMergable()");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "540785040bb657f7c19876119ed7ee00", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "540785040bb657f7c19876119ed7ee00");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).writeModelExposure(str, str2, map, str3);
        }
        LogUtil.log(TAG, "LX before init don't support writeModelExposure()");
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0730e803f355c2f89ac646313fb6877c", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0730e803f355c2f89ac646313fb6877c");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).writeModelExposureForMrnSDk(str, str2, map, str3, str4);
        }
        LogUtil.log(TAG, "LX before init don't support writeModelExposureForMrnSDk()");
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b783d593cf98041a70dd96074534209", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b783d593cf98041a70dd96074534209");
        } else {
            writeModelEdit(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3271471b3cb48042676362c85e61ed1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3271471b3cb48042676362c85e61ed1");
        } else {
            writeModelEdit(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da6566922ea579d7f128987a1af02a62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da6566922ea579d7f128987a1af02a62");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeModelEdit(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeModelEdit(str, str2, map, str3, z);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeModelEdit(str, str2, map, str3, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddb1188a73b9ac669447cb29314848a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddb1188a73b9ac669447cb29314848a6");
        } else {
            writeModelClick(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "019802f3fc8d4a0ec8ffe5414f2b4102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "019802f3fc8d4a0ec8ffe5414f2b4102");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeModelClick(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeModelClick(str, str2, map, str3, i);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeModelClick(str, str2, map, str3, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2374515957f60f4e82ab72ff5dfe6e45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2374515957f60f4e82ab72ff5dfe6e45");
        } else {
            writeModelClick(str, str2, map, "", false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b41587b256a3db90dc60b4bc0b1ad2cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b41587b256a3db90dc60b4bc0b1ad2cb");
        } else {
            writeModelClick(str, str2, map, str3, false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cd1c618be8bf2da8225ab8bc23d415", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cd1c618be8bf2da8225ab8bc23d415");
        } else {
            writeModelClick(str, str2, map, str3, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a98a3ce0af4a9953d61897553b247860", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a98a3ce0af4a9953d61897553b247860");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeModelClick(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeModelClick(str, str2, map, str3, z, z2);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeModelClick(str, str2, map, str3, z, z2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eabd51b884ccc9e1995f12f89c2efb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eabd51b884ccc9e1995f12f89c2efb5");
        } else {
            writeBizOrder(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "641d6a8a05c7f1c587489e580615cdfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "641d6a8a05c7f1c587489e580615cdfd");
        } else {
            writeBizOrder(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "271e6f10099705de97154deaae2fd11e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "271e6f10099705de97154deaae2fd11e");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeBizOrder(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeBizOrder(str, str2, map, str3, z);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeBizOrder(str, str2, map, str3, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c141ce2500b856ffb84837bcce9eb48f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c141ce2500b856ffb84837bcce9eb48f");
        } else {
            writeBizPay(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb5c180053ce2b64368441194d0a128c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb5c180053ce2b64368441194d0a128c");
        } else {
            writeBizPay(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06afd98368ac9c1c18082ab9fc52d716", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06afd98368ac9c1c18082ab9fc52d716");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeBizPay(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeBizPay(str, str2, map, str3, z);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeBizPay(str, str2, map, str3, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeShow(@NonNull String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8806f31d9700d7cb377c8d78857b979b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8806f31d9700d7cb377c8d78857b979b");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeShow(str, str2, map, str3, str4);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeSystemCheck(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e7990ea5c555beb6d7bfd88694aea39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e7990ea5c555beb6d7bfd88694aea39");
        } else {
            writeSystemCheck(str, str2, map, "");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6754111860e846736bb5834d72dd1383", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6754111860e846736bb5834d72dd1383");
        } else if (Statistics.isInitialized()) {
            LogUtil.log(TAG, "BeforeInitChannel invoke writeSystemCheck(), is already initialized!");
            Statistics.getChannel(getChannelName()).writeSystemCheck(str, str2, map, str3);
        } else if (this.mBeforeInitChannelDelegate != null) {
            this.mBeforeInitChannelDelegate.writeSystemCheck(str, str2, map, str3);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
        Object[] objArr = {str, str2, map, str3, eventName, midasInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06638a07ea49e605f3bd5e12902f53de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06638a07ea49e605f3bd5e12902f53de");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeAdEvent(str, str2, map, str3, eventName, midasInfo, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEvent(@NonNull String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17c27520b0a72358b29de5096a568cff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17c27520b0a72358b29de5096a568cff");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEvent(str, eventInfo);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, eventName, businessInfo, map, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d9a474714326b9f0d227f85650dbeb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d9a474714326b9f0d227f85650dbeb3");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEvent(str, eventName, businessInfo, map, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEvent(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "239a9210dbb9d55207643ff2343a3c13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "239a9210dbb9d55207643ff2343a3c13");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEvent(str, str2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void write(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c17329d1e7640605de33858d95f93471", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c17329d1e7640605de33858d95f93471");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEvent(str, eventInfo);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEventThroughWeb(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98897f6ebff7242ed1908ae77343b541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98897f6ebff7242ed1908ae77343b541");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEventThroughWeb(jSONObject, jSONObject2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public long getSeq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7ad980bc17bfe0373a8c1f03f700c2f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7ad980bc17bfe0373a8c1f03f700c2f")).longValue();
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).getSeq();
        }
        return 0L;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEventThroughMMP(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e62d482e6e35a548c29af39a3c240b4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e62d482e6e35a548c29af39a3c240b4a");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEventThroughMMP(jSONObject, jSONObject2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z) {
        Object[] objArr = {queue, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3304e199245ae8d67757355817195750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3304e199245ae8d67757355817195750");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).reportCacheEventListAfterPv(queue, jSONObject, z);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public String getEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1239b096abe24332491e537c26427c9a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1239b096abe24332491e537c26427c9a");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).getEnvironment();
        }
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public String getEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb74559f73d587434a9838a609178818", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb74559f73d587434a9838a609178818");
        }
        if (Statistics.isInitialized()) {
            return Statistics.getChannel(getChannelName()).getEnvironment(str);
        }
        return null;
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeEvent(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b6acd7508cd728f46f1320aefc67632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b6acd7508cd728f46f1320aefc67632");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeEvent(eventInfo);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelClick(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b18fdab3504a12b29b17893ac1543ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b18fdab3504a12b29b17893ac1543ff");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeModelClick(str, map, str2);
        } else {
            writeModelClick((String) null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeModelView(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3fd537c76478aa48573610a54285fe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3fd537c76478aa48573610a54285fe9");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeModelView(str, map, str2);
        } else {
            writeModelView((String) null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizOrder(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11caac300a32d68a80d5b2bcf6ce28f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11caac300a32d68a80d5b2bcf6ce28f9");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeBizOrder(str, map, str2);
        } else {
            writeBizOrder(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.Channel
    public void writeBizPay(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb8cda1fa139e05f5234faf9cc231cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb8cda1fa139e05f5234faf9cc231cd");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel(getChannelName()).writeBizPay(str, map, str2);
        } else {
            writeBizPay(null, str, map, str2, false);
        }
    }
}
