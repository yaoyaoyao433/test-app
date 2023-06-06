package com.hhmedic.android.sdk.listener;

import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.module.call.LocalState;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHVideoNotification {
    private static HHCallListener mListener;

    public static void addListener(HHCallListener hHCallListener) {
        synchronized (HHVideoNotification.class) {
            mListener = hHCallListener;
        }
    }

    public static void onStart(String str) {
        try {
            if (mListener != null) {
                mListener.onStart(str);
            }
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    public static void onCallSuccess() {
        if (mListener != null) {
            mListener.onCallSuccess();
        }
    }

    public static void onFinish(long j) {
        LocalState.getInstance().release();
        if (mListener != null) {
            mListener.onFinish(j);
        }
        mListener = null;
    }

    public static void onCancel() {
        LocalState.getInstance().release();
        if (mListener != null) {
            mListener.onCancel();
        }
    }

    public static void onFail(long j) {
        try {
            LocalState.getInstance().release();
            if (mListener != null) {
                mListener.onFail((int) j);
            }
        } catch (Exception e) {
            Logger.e("onFail error:" + e.getLocalizedMessage());
        }
    }
}
