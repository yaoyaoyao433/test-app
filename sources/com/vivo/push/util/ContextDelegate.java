package com.vivo.push.util;

import android.content.Context;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ContextDelegate {
    private static final String TAG = "ContextDelegate";
    private static Context mContext = null;
    private static Method mCreateCredentialProtectedStorageContext = null;
    private static Method mCreateDeviceProtectedStorageContext = null;
    private static boolean mDelegateEnable = false;
    private static Boolean mIsFbeProject;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a {
        private static ContextDelegate a = new ContextDelegate();
    }

    public static ContextDelegate getInstance() {
        return a.a;
    }

    public static void setEnable(boolean z) {
        mDelegateEnable = z;
        setAppContext();
    }

    public static Context getContext(Context context) {
        if (!isFBEProject() || context == null) {
            return context;
        }
        if (mContext != null) {
            return mContext;
        }
        setContext(context);
        return mContext;
    }

    private static void setContext(Context context) {
        if (!mDelegateEnable) {
            mContext = createCredentialProtectedStorageContext(context);
        } else {
            mContext = createDeviceProtectedStorageContext(context);
        }
    }

    private static void setAppContext() {
        if (mContext == null) {
            return;
        }
        setContext(mContext);
    }

    private static Context createDeviceProtectedStorageContext(Context context) {
        try {
            if (mCreateDeviceProtectedStorageContext == null) {
                mCreateDeviceProtectedStorageContext = Context.class.getMethod("createDeviceProtectedStorageContext", new Class[0]);
            }
            return (Context) mCreateDeviceProtectedStorageContext.invoke(context, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    private static Context createCredentialProtectedStorageContext(Context context) {
        try {
            if (mCreateCredentialProtectedStorageContext == null) {
                mCreateCredentialProtectedStorageContext = Context.class.getMethod("createCredentialProtectedStorageContext", new Class[0]);
            }
            return (Context) mCreateCredentialProtectedStorageContext.invoke(context, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    public static boolean isFBEProject() {
        if (mIsFbeProject == null) {
            try {
                mIsFbeProject = Boolean.valueOf("file".equals(j.a("ro.crypto.type", "unknow")));
                p.b(TAG, "mIsFbeProject = " + mIsFbeProject.toString());
            } catch (Exception e) {
                p.a(TAG, "mIsFbeProject = " + e.getMessage());
            }
        }
        if (mIsFbeProject == null) {
            return false;
        }
        return mIsFbeProject.booleanValue();
    }
}
