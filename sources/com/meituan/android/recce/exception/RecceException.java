package com.meituan.android.recce.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum RecceException {
    SO_DOWNLOAD_FAILED(100, "so_download_failed"),
    SO_LOAD_FAILED(101, "so_load_failed"),
    INIT_SO_FAILED(102, "so_init_failed"),
    RECCE_SO_UN_AVAILABLE(103, "recce_so_un_available"),
    RENDER_ROOT_VIEW_ERROR(200, "render_root_view_exception"),
    REACT_INNER_ERROR(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, "react_inner_exception"),
    ROOT_VIEW_EMPTY(202, "subview_empty"),
    INIT_HOST_FAILED(TbsListener.ErrorCode.APK_VERSION_ERROR, "prepare_failed"),
    REACT_QUEUE_EXCEPTION(TbsListener.ErrorCode.APK_INVALID, "react_queue_create_exception"),
    UPDATE_VIEW_FAILED(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "update_view_failed"),
    BATCH_COMPLETE_FAILED(TbsListener.ErrorCode.UNZIP_IO_ERROR, "batch_complete_failed");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String errorName;

    public static RecceException valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23d4d9985400ea4a78ead7578026968b", RobustBitConfig.DEFAULT_VALUE) ? (RecceException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23d4d9985400ea4a78ead7578026968b") : (RecceException) Enum.valueOf(RecceException.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RecceException[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61476dc28667601c64b352f8ae856d08", RobustBitConfig.DEFAULT_VALUE) ? (RecceException[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61476dc28667601c64b352f8ae856d08") : (RecceException[]) values().clone();
    }

    RecceException(int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0ab7d063bbd19b9602c84e29444d06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0ab7d063bbd19b9602c84e29444d06");
            return;
        }
        this.code = i;
        this.errorName = str;
    }

    public final String errorName() {
        return this.errorName;
    }

    public final int code() {
        return this.code;
    }
}
