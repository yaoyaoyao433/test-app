package com.meituan.android.common.dfingerprint;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.CryptoKeyIndex;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3CandyInterceptor;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import okhttp3.Interceptor;
/* loaded from: classes2.dex */
public class DFPManager extends IDFPManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static volatile String sDFPDataCache = "";
    private Context context;
    private ICypher cypher;
    private SyncStoreManager idStore;
    private Interceptor interceptor;

    public DFPManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f69497c41c9d85f13ab26f7cf308f466", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f69497c41c9d85f13ab26f7cf308f466");
            return;
        }
        this.context = context;
        this.interceptor = new Ok3CandyInterceptor(context);
        this.cypher = new ICypher() { // from class: com.meituan.android.common.dfingerprint.DFPManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.interfaces.ICypher
            public byte[] decrypt(byte[] bArr) {
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b73e35e9fbd7f0de6c6f42700d8b1d96", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b73e35e9fbd7f0de6c6f42700d8b1d96") : MTGuard.decrypt(bArr, CryptoKeyIndex.AESKEY);
            }

            @Override // com.meituan.android.common.dfingerprint.interfaces.ICypher
            public byte[] encrypt(byte[] bArr) {
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3413dee2916ccf22ae0aff464a428d61", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3413dee2916ccf22ae0aff464a428d61") : MTGuard.encrypt(bArr, CryptoKeyIndex.AESKEY);
            }
        };
        this.idStore = new SyncStoreManager(this);
        this.idStore.addIdHandler(new SyncStoreManager.SharedPrefSaveIdHandler(this));
    }

    public static String dfpData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f7b64ccda3a9c29d739efec65a646e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f7b64ccda3a9c29d739efec65a646e4");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.dfingerprint.DFPManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22a31f2484196b960785fc268f904793", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22a31f2484196b960785fc268f904793");
                    } else {
                        DFPManager.sDFPDataCache = DFPManager.encDfpDataForFingerPrint();
                    }
                }
            });
        } else {
            sDFPDataCache = encDfpDataForFingerPrint();
        }
        return DFPConfigs.PREFIX + sDFPDataCache;
    }

    public static void dfpData(final DFPDataCallBack dFPDataCallBack) {
        Object[] objArr = {dFPDataCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7958dc6bc699f992462ffcc0fece309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7958dc6bc699f992462ffcc0fece309");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.dfingerprint.DFPManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62665a6da2dd137e9eba851a2f464566", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62665a6da2dd137e9eba851a2f464566");
                        return;
                    }
                    MTGuardLog.setLogan("dfpData runnable execute");
                    String encDfpDataForFingerPrint = DFPManager.encDfpDataForFingerPrint();
                    DFPManager.sDFPDataCache = encDfpDataForFingerPrint;
                    if (TextUtils.isEmpty(encDfpDataForFingerPrint)) {
                        DFPDataCallBack.this.onFailed(-1, "internal error");
                        return;
                    }
                    DFPDataCallBack dFPDataCallBack2 = DFPDataCallBack.this;
                    dFPDataCallBack2.onSuccess(DFPConfigs.PREFIX + DFPManager.sDFPDataCache);
                }
            });
        } else {
            MTGuardLog.setLogan("Non-main thread, direct execution");
            String encDfpDataForFingerPrint = encDfpDataForFingerPrint();
            sDFPDataCache = encDfpDataForFingerPrint;
            if (TextUtils.isEmpty(encDfpDataForFingerPrint)) {
                dFPDataCallBack.onFailed(-1, "internal error");
                return;
            }
            dFPDataCallBack.onSuccess(DFPConfigs.PREFIX + sDFPDataCache);
        }
    }

    public static String encDfpDataForFingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b196a27382d9e11e4497c7d887e2f34", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b196a27382d9e11e4497c7d887e2f34");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String main1 = NBridge.main1(44, new Object[0]);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        MTGlibInterface.raptorAPI(MTGlibInterface.API_KEY_dfpData, 200, main1 == null ? 0 : main1.length(), 0, currentTimeMillis2);
        MTGuardLog.setLogan("dfpdata cost:" + currentTimeMillis2);
        return main1;
    }

    @Override // com.meituan.android.common.dfingerprint.interfaces.IDFPManager
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "292a4ded57cabd7d2ad0a05cd23bc166", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "292a4ded57cabd7d2ad0a05cd23bc166") : this.context.getApplicationContext();
    }

    @Override // com.meituan.android.common.dfingerprint.interfaces.IDFPManager
    public ICypher getCypher() {
        return this.cypher;
    }

    @Override // com.meituan.android.common.dfingerprint.interfaces.IDFPManager
    public SyncStoreManager getIdStore() {
        return this.idStore;
    }

    @Override // com.meituan.android.common.dfingerprint.interfaces.IDFPManager
    public Interceptor getInterceptor() {
        return this.interceptor;
    }
}
