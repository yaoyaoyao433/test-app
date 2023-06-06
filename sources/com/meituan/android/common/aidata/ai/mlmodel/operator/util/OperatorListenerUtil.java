package com.meituan.android.common.aidata.ai.mlmodel.operator.util;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorListener;
import com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorListenerUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void callSuccess(IOperatorListener iOperatorListener, JSONArray jSONArray, List<String> list) {
        Object[] objArr = {iOperatorListener, jSONArray, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "899f7dab8ea21be70a3f084819d40188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "899f7dab8ea21be70a3f084819d40188");
        } else if (iOperatorListener != null) {
            iOperatorListener.onSuccess(jSONArray, list);
        }
    }

    public static void callFailed(IOperatorListener iOperatorListener) {
        Object[] objArr = {iOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7dec1f69010696f43a5dfe4630fd845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7dec1f69010696f43a5dfe4630fd845");
        } else {
            callFailed(iOperatorListener, null);
        }
    }

    public static void callFailed(IOperatorListener iOperatorListener, @Nullable Exception exc) {
        Object[] objArr = {iOperatorListener, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e3239f1e63d0fa417821ee421a22c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e3239f1e63d0fa417821ee421a22c2d");
        } else if (iOperatorListener != null) {
            iOperatorListener.onFailed(exc);
        }
    }

    public static void callInnerSuccess(IInnerOperatorListener iInnerOperatorListener, JSONArray jSONArray) {
        Object[] objArr = {iInnerOperatorListener, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b86dab54064631d4852686091e8c603c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b86dab54064631d4852686091e8c603c");
        } else if (iInnerOperatorListener != null) {
            iInnerOperatorListener.onSuccess(jSONArray);
        }
    }

    public static void callInnerFailed(IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51d5247e53c486edb813420c831c00ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51d5247e53c486edb813420c831c00ed");
        } else {
            callInnerFailed(iInnerOperatorListener, null);
        }
    }

    public static void callInnerFailed(IInnerOperatorListener iInnerOperatorListener, @Nullable BlueException blueException) {
        Object[] objArr = {iInnerOperatorListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcb64660acad9999f2ec4f48ee09819f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcb64660acad9999f2ec4f48ee09819f");
        } else if (iInnerOperatorListener != null) {
            iInnerOperatorListener.onFailed(blueException);
        }
    }

    public static void callSingleSuccess(ISingleOperatorListener iSingleOperatorListener, JSONArray jSONArray, String str) {
        Object[] objArr = {iSingleOperatorListener, jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88a44130b097817532bd87ba6afff12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88a44130b097817532bd87ba6afff12d");
        } else if (iSingleOperatorListener != null) {
            iSingleOperatorListener.onSuccess(jSONArray, str);
        }
    }

    public static void callSingleFailed(ISingleOperatorListener iSingleOperatorListener, @Nullable Exception exc) {
        Object[] objArr = {iSingleOperatorListener, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a57cb9b6098dd61aac96c4247160f63e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a57cb9b6098dd61aac96c4247160f63e");
        } else if (iSingleOperatorListener != null) {
            iSingleOperatorListener.onFailed(exc);
        }
    }
}
