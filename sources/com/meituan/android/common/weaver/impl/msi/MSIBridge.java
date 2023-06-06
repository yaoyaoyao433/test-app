package com.meituan.android.common.weaver.impl.msi;

import android.app.Activity;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.RemoteConfig;
import com.meituan.android.common.weaver.impl.WeaverProxy;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEventWithActivity;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.metrics.base.FfpAddCustomTagsParam;
import com.meituan.msi.metrics.base.FspRecordParam;
import com.meituan.msi.metrics.base.IBaseAdaptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MSIBridge extends IBaseAdaptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sReporter = new ErrorReporter("msi", 2);

    @Override // com.meituan.msi.metrics.base.IBaseAdaptor
    public void ffpAddCustomTags(MsiCustomContext msiCustomContext, FfpAddCustomTagsParam ffpAddCustomTagsParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, ffpAddCustomTagsParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5eb75242f161737fbab8e619723f874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5eb75242f161737fbab8e619723f874");
        } else if (!RemoteConfig.sConfig.enable || msiCustomContext == null || msiCustomContext.getActivity() == null) {
        } else {
            try {
                customTags(msiCustomContext, ffpAddCustomTagsParam);
                iVar.a(EmptyResponse.INSTANCE);
            } catch (Throwable th) {
                sReporter.report(th);
            }
        }
    }

    private void customTags(MsiCustomContext msiCustomContext, FfpAddCustomTagsParam ffpAddCustomTagsParam) {
        Object[] objArr = {msiCustomContext, ffpAddCustomTagsParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f502b877305c10d087af6e7b2f27c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f502b877305c10d087af6e7b2f27c18");
            return;
        }
        CustomTagsEventWithActivity customTagsEventWithActivity = new CustomTagsEventWithActivity(ffpAddCustomTagsParam.pagePath, msiCustomContext.getActivity());
        if (ffpAddCustomTagsParam.customTags instanceof JSONObject) {
            customTagsEventWithActivity.withExtra(FFPUtil.json2Map((JSONObject) ffpAddCustomTagsParam.customTags));
        } else if (!(ffpAddCustomTagsParam.customTags instanceof Map)) {
            return;
        } else {
            customTagsEventWithActivity.withExtra((Map) ffpAddCustomTagsParam.customTags);
        }
        Weaver.getWeaver().weave(customTagsEventWithActivity);
    }

    @Override // com.meituan.msi.metrics.base.IBaseAdaptor
    public void fspRecord(MsiCustomContext msiCustomContext, FspRecordParam fspRecordParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, fspRecordParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a71aa6d420633d8dd65c979b45a6df4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a71aa6d420633d8dd65c979b45a6df4e");
        } else if (!RemoteConfig.sConfig.enable || msiCustomContext == null || msiCustomContext.getActivity() == null) {
        } else {
            try {
                worker(msiCustomContext, fspRecordParam, iVar);
            } catch (Throwable th) {
                sReporter.report(th);
            }
        }
    }

    private void worker(MsiCustomContext msiCustomContext, FspRecordParam fspRecordParam, i<EmptyResponse> iVar) {
        ContainerEvent of;
        Object[] objArr = {msiCustomContext, fspRecordParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a10764021937d4487ab5cc95cd6fd27d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a10764021937d4487ab5cc95cd6fd27d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ContainerEvent.EXTRA_CREATE_MS, Long.valueOf(fspRecordParam.createMs));
        hashMap.put("tType", msiCustomContext.getContainerInfo().name);
        hashMap.put("eType", fspRecordParam.eType);
        hashMap.put("pagePath", fspRecordParam.pagePath);
        hashMap.put("pageUrl", fspRecordParam.pageUrl);
        hashMap.put("renderRate", Float.valueOf(fspRecordParam.renderRate));
        hashMap.put("reachBottom", fspRecordParam.reachBottom);
        hashMap.put("costMs", Integer.valueOf(fspRecordParam.costMs));
        if (!hashMap.containsKey("appId")) {
            hashMap.put("appId", msiCustomContext.getContainerInfo().containerId);
        }
        if (fspRecordParam.tags instanceof JSONObject) {
            hashMap.putAll(FFPUtil.json2Map((JSONObject) fspRecordParam.tags));
        } else if (fspRecordParam.tags instanceof Map) {
            hashMap.putAll((Map) fspRecordParam.tags);
        } else if (fspRecordParam.tags != null) {
            Logger.getLogger().d("msi bridge: unknown tags type: ", fspRecordParam.tags);
        }
        if (ContainerInfo.ENV_MSC.equals(msiCustomContext.getContainerInfo().name)) {
            of = ContainerEvent.msc(msiCustomContext.getActivity(), msiCustomContext.getContainerInfo().containerId, hashMap);
        } else {
            of = ContainerEvent.of(ContainerEvent.CONTAINER_NAME_MSC, msiCustomContext.getActivity(), msiCustomContext.getContainerInfo(), hashMap);
        }
        Activity activity = msiCustomContext.getActivity();
        if (Weaver.sImpl == null && !ProcessUtils.isMainProcess(activity)) {
            WeaverProxy.init(msiCustomContext.getActivity());
        }
        Weaver.getWeaver().weave(of);
        Logger.getLogger().d("msi bridge message from ", msiCustomContext.getContainerInfo().name, ": ", hashMap);
        iVar.a(EmptyResponse.INSTANCE);
    }
}
