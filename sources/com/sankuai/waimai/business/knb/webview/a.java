package com.sankuai.waimai.business.knb.webview;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b35178d30da8c2c8ab618f79f15f14c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b35178d30da8c2c8ab618f79f15f14c");
        }
        switch (i) {
            case -16:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_load_overtime);
            case -15:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_too_many_request);
            case -14:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_look_up_file_failed);
            case -13:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_operate_file_error);
            case -12:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_invalid_connect_format);
            case -11:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_set_up_safe_connect_failed);
            case -10:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_unsupported_protocol_used);
            case -9:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_too_many_redirect_times);
            case -8:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_connect_overtime);
            case -7:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_server_io_failed);
            case -6:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_connect_server_failed);
            case -5:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_connect_agent_server_failed);
            case -4:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_server_can_not_verify_id);
            case -3:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_invalid_verification_is_used);
            case -2:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_can_not_find_website);
            default:
                return com.meituan.android.singleton.b.a.getString(R.string.wm_knb_error_request_error);
        }
    }
}
