package com.sankuai.xm.imui.common.util;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(final Context context, final int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4edb2e15757030d53fdbd6e8b2fb8bb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4edb2e15757030d53fdbd6e8b2fb8bb7");
        } else if (i == 0) {
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.util.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a1e2ce5f173d3b39b59f83c5dbe5cd8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a1e2ce5f173d3b39b59f83c5dbe5cd8");
                    } else if (context == null) {
                    } else {
                        int i3 = i;
                        if (i3 == -1) {
                            i2 = R.string.xm_sdk_session_msg_error_fail;
                        } else if (i3 != 10020) {
                            switch (i3) {
                                case 10001:
                                    i2 = R.string.xm_sdk_session_msg_error_text_empty;
                                    break;
                                case 10002:
                                default:
                                    i2 = -1;
                                    break;
                                case 10003:
                                    i2 = R.string.xm_sdk_session_msg_error_local_file_not_exists;
                                    break;
                                case 10004:
                                    i2 = R.string.xm_sdk_session_msg_error_send_too_frequently;
                                    break;
                                case 10005:
                                    i2 = R.string.xm_sdk_session_msg_error_file_too_large;
                                    break;
                                case 10006:
                                    i2 = R.string.xm_sdk_session_msg_error_file_format;
                                    break;
                                case 10007:
                                    i2 = R.string.xm_sdk_session_msg_error_not_login;
                                    break;
                                case RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT /* 10008 */:
                                    i2 = R.string.xm_sdk_session_msg_error_no_local_data;
                                    break;
                                case RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT /* 10009 */:
                                    i2 = R.string.xm_sdk_session_msg_error_db_not_ready;
                                    break;
                                case RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT /* 10010 */:
                                    i2 = R.string.xm_sdk_session_msg_error_unsupported_msg_type;
                                    break;
                            }
                        } else {
                            i2 = R.string.xm_sdk_session_msg_error_time_out;
                        }
                        if (i2 != -1) {
                            ad.a(context, i2);
                        }
                    }
                }
            }));
        }
    }
}
