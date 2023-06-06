package com.meituan.uuid;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UUIDSaveManager {
    public static final int FLAG_SAVE_TO_ALL = 30;
    public static final int FLAG_SAVE_TO_CURRENT_APP = 14;
    public static final int FLAG_SAVE_TO_GLOBAL_FILE = 4;
    public static final int FLAG_SAVE_TO_OTHER_APPS = 16;
    public static final int FLAG_SAVE_TO_PREFERENCE = 2;
    public static final int FLAG_SAVE_TO_SDCARD_ENCRYPTED = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SparseArray<String> lastSavedUUIDMap = new SparseArray<>();
    private Executor sSaveExecutor;

    public UUIDSaveManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2c55ba0985211ebb4898fd253cb5d96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2c55ba0985211ebb4898fd253cb5d96");
        } else {
            this.sSaveExecutor = c.a("uuid-save-executor");
        }
    }

    public static UUIDSaveManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "873ef7ae7474c2ec2f4a3df7fc910f99", 6917529027641081856L) ? (UUIDSaveManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "873ef7ae7474c2ec2f4a3df7fc910f99") : SingletonHolder.INSTANCE;
    }

    public void saveToCurrentApp(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add998f6eeedc348ac6ee654d546a0d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add998f6eeedc348ac6ee654d546a0d7");
        } else {
            saveUUIDByFlag(context, str, 14);
        }
    }

    public void saveToAll(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7061dc77ac5f2078cc940a4eeacc67cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7061dc77ac5f2078cc940a4eeacc67cf");
        } else {
            saveUUIDByFlag(context, str, 30);
        }
    }

    public void saveUUIDByFlag(final Context context, final String str, final int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00307b37f78771824d542b1d0f3e9131", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00307b37f78771824d542b1d0f3e9131");
        } else if (UUIDHelper.checkUUIDValid(str)) {
            b.a(this.sSaveExecutor, new Runnable() { // from class: com.meituan.uuid.UUIDSaveManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3a4632048e74daeea7c4d5047c7f05a9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3a4632048e74daeea7c4d5047c7f05a9");
                    } else if (UUIDHelper.checkUUIDValid(str)) {
                        if (context != null && (i & 2) == 2 && !UUIDSaveManager.isUUIDSaved(str, 2) && UUIDHelper.saveToPreference(context, str)) {
                            UUIDSaveManager.lastSavedUUIDMap.put(2, str);
                        }
                        if (context != null && (i & 4) == 4 && !UUIDSaveManager.isUUIDSaved(str, 4) && UUIDHelper.saveToGlobalReadOnlyFile(context, str)) {
                            UUIDSaveManager.lastSavedUUIDMap.put(4, str);
                        }
                        if (context != null && (i & 8) == 8 && !UUIDSaveManager.isUUIDSaved(str, 8) && UUIDHelper.saveToSdcardEncrypted(context, str)) {
                            UUIDSaveManager.lastSavedUUIDMap.put(8, str);
                        }
                        if (context == null || (i & 16) != 16 || UUIDSaveManager.isUUIDSaved(str, 16) || !UUIDHelper.saveToOtherApps(context, str)) {
                            return;
                        }
                        UUIDSaveManager.lastSavedUUIDMap.put(16, str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isUUIDSaved(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ff85f9c6859f580ec1f479299a29647", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ff85f9c6859f580ec1f479299a29647")).booleanValue() : TextUtils.equals(str, lastSavedUUIDMap.get(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SingletonHolder {
        private static final UUIDSaveManager INSTANCE = new UUIDSaveManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
