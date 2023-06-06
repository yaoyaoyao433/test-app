package com.meituan.android.common.horn;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.horn.extra.monitor.IHornMonitorService;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.Utils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornCacheCenter {
    public static final int CACHE_DURATION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile HornCacheCenter configHub;
    public final Map<String, Map<String, String>> mConfig;
    public final Map<String, HornCallback> mConfigCallbacks;
    private final Context mContext;
    public final Map<String, HornConfigEntity> mPublic;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TypeInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public long lastTime;
    }

    public static synchronized HornCacheCenter getInstance(Context context) {
        synchronized (HornCacheCenter.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a02c07c1fbe9e810b74996e23507dd28", 6917529027641081856L)) {
                return (HornCacheCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a02c07c1fbe9e810b74996e23507dd28");
            }
            if (configHub == null) {
                configHub = new HornCacheCenter(context);
            }
            return configHub;
        }
    }

    public HornCacheCenter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42f17bd188be878d97f7a340b6333a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42f17bd188be878d97f7a340b6333a59");
            return;
        }
        this.mConfigCallbacks = new ConcurrentHashMap();
        this.mConfig = new ConcurrentHashMap();
        this.mPublic = new ConcurrentHashMap();
        this.mContext = context;
    }

    public void optCallback(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf9a273779a0da64b584a6e3928db05e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf9a273779a0da64b584a6e3928db05e");
            return;
        }
        synchronized (this.mConfigCallbacks) {
            if (this.mConfigCallbacks.containsKey(str)) {
                this.mConfigCallbacks.remove(str);
            }
            this.mConfigCallbacks.put(str, hornCallback);
        }
    }

    private List<String> obtainFiles() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2056fa25f82e967114a176514df78179", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2056fa25f82e967114a176514df78179");
        }
        File file = new File(getCacheDir() + "/horn");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (name.contains("final_horn_config_")) {
                arrayList.add(name.substring(name.indexOf("final_horn_config_") + 18, name.length()));
            }
        }
        return arrayList;
    }

    public boolean discToMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e06567ae31d023a7608a02bb0ccbc0da", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e06567ae31d023a7608a02bb0ccbc0da")).booleanValue();
        }
        try {
            for (String str : obtainFiles()) {
                optPublicData(str, obtainConfigFromCache(str));
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean cacheConfigData(String str, @Nullable Map<String, String> map, @NonNull MonitorRecord monitorRecord) {
        Object[] objArr = {str, map, monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75839ff5f33404158b2f4c6dbdad5c8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75839ff5f33404158b2f4c6dbdad5c8")).booleanValue();
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!obtainConfigFromFile(str).equals(map)) {
            cacheConfigDataFile(map, str);
        }
        if (this.mConfig.containsKey(str)) {
            this.mConfig.remove(str);
        }
        this.mConfig.put(str, map);
        optPublicData(str, map);
        if (getDebugConfigFile(str).exists()) {
            map = obtainConfigFromDebugFile(str);
        }
        HornInfoHub.validateCache(str);
        return optCustomerData(str, map, true, monitorRecord);
    }

    public boolean cacheBinaryFile(String str, String str2) {
        boolean z;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bfa637a1ec454111e5bbf7e98f41a85", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bfa637a1ec454111e5bbf7e98f41a85")).booleanValue();
        }
        try {
            if (this.mConfigCallbacks.get(str) instanceof BlobCallback) {
                File binaryFile = getBinaryFile(str);
                if (binaryFile.exists()) {
                    z = false;
                } else {
                    z = BlobDownLoadUtils.simpleDownload(str2, binaryFile).booleanValue();
                    if (z) {
                        cacheLastBinaryName(str, binaryFile.getAbsolutePath());
                    }
                }
                return z & optCustomerBinaryData(str, true, null);
            }
            return false;
        } catch (Exception e) {
            optCustomerBinaryData(str, true, e);
            if (InnerHorn.isDebug) {
                e.printStackTrace();
                return false;
            }
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized void cacheLastBinaryName(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb0
            r8 = 0
            r0[r8] = r12     // Catch: java.lang.Throwable -> Lb0
            r1 = 1
            r0[r1] = r13     // Catch: java.lang.Throwable -> Lb0
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r10 = "6bf49855fbc3380573dde2d8e6f7b54b"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r11)
            return
        L20:
            java.util.Map r0 = r11.obtainAllLastBinaryName()     // Catch: java.lang.Throwable -> Lb0
            r0.put(r12, r13)     // Catch: java.lang.Throwable -> Lb0
            r13 = 0
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> La0
            if (r12 == 0) goto L30
            monitor-exit(r11)
            return
        L30:
            if (r0 != 0) goto L34
            monitor-exit(r11)
            return
        L34:
            android.content.Context r12 = r11.mContext     // Catch: java.lang.Throwable -> La0
            com.meituan.android.common.horn.ProcessLock r12 = com.meituan.android.common.horn.ProcessLock.lock(r12)     // Catch: java.lang.Throwable -> La0
            java.io.File r1 = r11.getLastBlobFile()     // Catch: java.lang.Throwable -> La1
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L47
            r1.delete()     // Catch: java.lang.Throwable -> La1
        L47:
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> La1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La1
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La1
            int r13 = r0.size()     // Catch: java.lang.Throwable -> L8d
            r2.writeInt(r13)     // Catch: java.lang.Throwable -> L8d
            java.util.Set r13 = r0.entrySet()     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L8d
        L60:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L8d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8d
            r2.writeObject(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8d
            r2.writeObject(r0)     // Catch: java.lang.Throwable -> L8d
            goto L60
        L7b:
            r2.flush()     // Catch: java.lang.Throwable -> L8d
            r2.close()     // Catch: java.lang.Throwable -> L81
        L81:
            if (r12 == 0) goto L89
            r12.close()     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            monitor-exit(r11)
            return
        L89:
            monitor-exit(r11)
            return
        L8b:
            r0 = move-exception
            goto L95
        L8d:
            r13 = r2
            goto La1
        L8f:
            r0 = move-exception
            r2 = r13
            goto L95
        L92:
            r0 = move-exception
            r12 = r13
            r2 = r12
        L95:
            if (r2 == 0) goto L9a
            r2.close()     // Catch: java.lang.Throwable -> L9a
        L9a:
            if (r12 == 0) goto L9f
            r12.close()     // Catch: java.lang.Throwable -> L9f
        L9f:
            throw r0     // Catch: java.lang.Throwable -> Lb0
        La0:
            r12 = r13
        La1:
            if (r13 == 0) goto La6
            r13.close()     // Catch: java.lang.Throwable -> La6
        La6:
            if (r12 == 0) goto Lae
            r12.close()     // Catch: java.lang.Throwable -> Lac
            goto Lae
        Lac:
            monitor-exit(r11)
            return
        Lae:
            monitor-exit(r11)
            return
        Lb0:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.cacheLastBinaryName(java.lang.String, java.lang.String):void");
    }

    public String obtainLastBinaryName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af6861f9223fc2491ef4621a1cbd978", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af6861f9223fc2491ef4621a1cbd978");
        }
        String str2 = obtainAllLastBinaryName().get(str);
        return !TextUtils.isEmpty(str2) ? str2 : "";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized java.util.Map<java.lang.String, java.lang.String> obtainAllLastBinaryName() {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L91
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect     // Catch: java.lang.Throwable -> L91
            java.lang.String r10 = "73a1bcf3255806d096283e7964072526"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L1d
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)     // Catch: java.lang.Throwable -> L91
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L91
            monitor-exit(r11)
            return r0
        L1d:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            r2 = 0
            android.content.Context r3 = r11.mContext     // Catch: java.lang.Throwable -> L73
            com.meituan.android.common.horn.ProcessLock r3 = com.meituan.android.common.horn.ProcessLock.lock(r3)     // Catch: java.lang.Throwable -> L73
            java.io.File r4 = r11.getLastBlobFile()     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L3f
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            monitor-exit(r11)
            return r1
        L3f:
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L74
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L74
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L74
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74
            int r2 = r5.readInt()     // Catch: java.lang.Throwable -> L6f
        L4d:
            int r4 = r2 * 2
            if (r0 >= r4) goto L63
            java.lang.Object r4 = r5.readObject()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r5.readObject()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6f
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + 2
            goto L4d
        L63:
            r5.close()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L91
        L66:
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.lang.Throwable -> L6b
        L6b:
            monitor-exit(r11)
            return r1
        L6d:
            r2 = r5
            goto L85
        L6f:
            r2 = r5
            goto L74
        L71:
            r3 = r2
            goto L85
        L73:
            r3 = r2
        L74:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L7e
            r2.close()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L91
        L7e:
            if (r3 == 0) goto L83
            r3.close()     // Catch: java.lang.Throwable -> L83
        L83:
            monitor-exit(r11)
            return r1
        L85:
            if (r2 == 0) goto L8a
            r2.close()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L91
        L8a:
            if (r3 == 0) goto L8f
            r3.close()     // Catch: java.lang.Throwable -> L8f
        L8f:
            monitor-exit(r11)
            return r1
        L91:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.obtainAllLastBinaryName():java.util.Map");
    }

    private File getLastBlobFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d294a7a9430f64912879aa97742bf3a2", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d294a7a9430f64912879aa97742bf3a2");
        }
        return new File(getCacheDir() + "/horn", "last_blob_name");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private java.util.Map<java.lang.String, java.lang.String> obtainConfigFromDebugFile(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "9d2fb9638133c7c8cf31dd13f7a54f42"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.util.Map r12 = (java.util.Map) r12
            return r12
        L1e:
            android.content.Context r0 = r11.mContext
            if (r0 != 0) goto L28
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            return r12
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L34
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            return r12
        L34:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r11.mContext     // Catch: java.lang.Throwable -> L99
            com.meituan.android.common.horn.ProcessLock r2 = com.meituan.android.common.horn.ProcessLock.lock(r2)     // Catch: java.lang.Throwable -> L99
            java.io.File r12 = r11.getDebugConfigFile(r12)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = r12.exists()     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L55
            java.util.HashMap r12 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9a
            r12.<init>()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L54
            r2.close()     // Catch: java.lang.Throwable -> L54
        L54:
            return r12
        L55:
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L9a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            r3.readUTF()     // Catch: java.lang.Throwable -> L88
            int r12 = r3.readInt()     // Catch: java.lang.Throwable -> L88
        L66:
            int r1 = r12 * 2
            if (r8 >= r1) goto L7c
            java.lang.Object r1 = r3.readObject()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L88
            java.lang.Object r4 = r3.readObject()     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L88
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L88
            int r8 = r8 + 2
            goto L66
        L7c:
            r3.close()     // Catch: java.lang.Exception -> L7f
        L7f:
            if (r2 == 0) goto La2
        L81:
            r2.close()     // Catch: java.lang.Throwable -> La2
            goto La2
        L85:
            r12 = move-exception
            r1 = r3
            goto L8e
        L88:
            r1 = r3
            goto L9a
        L8a:
            r12 = move-exception
            goto L8e
        L8c:
            r12 = move-exception
            r2 = r1
        L8e:
            if (r1 == 0) goto L93
            r1.close()     // Catch: java.lang.Exception -> L93
        L93:
            if (r2 == 0) goto L98
            r2.close()     // Catch: java.lang.Throwable -> L98
        L98:
            throw r12
        L99:
            r2 = r1
        L9a:
            if (r1 == 0) goto L9f
            r1.close()     // Catch: java.lang.Exception -> L9f
        L9f:
            if (r2 == 0) goto La2
            goto L81
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.obtainConfigFromDebugFile(java.lang.String):java.util.Map");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void cacheConfigDataFile(@android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "33f71cc740dac428e7da402864a7b3de"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1e:
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L26
            return
        L26:
            if (r12 != 0) goto L29
            return
        L29:
            android.content.Context r1 = r11.mContext     // Catch: java.lang.Throwable -> L99
            com.meituan.android.common.horn.ProcessLock r1 = com.meituan.android.common.horn.ProcessLock.lock(r1)     // Catch: java.lang.Throwable -> L99
            java.io.File r2 = r11.getConfigFile(r13)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L3c
            r11.clearConfigFile(r13)     // Catch: java.lang.Throwable -> L9a
        L3c:
            java.io.File r3 = r2.getParentFile()     // Catch: java.lang.Throwable -> L9a
            r3.mkdirs()     // Catch: java.lang.Throwable -> L9a
            r2.createNewFile()     // Catch: java.lang.Throwable -> L9a
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L9a
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            android.content.Context r0 = r11.mContext     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = com.meituan.android.common.horn.HornUtils.getVersionName(r0)     // Catch: java.lang.Throwable -> L93
            r3.writeUTF(r0)     // Catch: java.lang.Throwable -> L93
            int r0 = r12.size()     // Catch: java.lang.Throwable -> L93
            r3.writeInt(r0)     // Catch: java.lang.Throwable -> L93
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L93
        L68:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L83
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L93
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L93
            r3.writeObject(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L93
            r3.writeObject(r0)     // Catch: java.lang.Throwable -> L93
            goto L68
        L83:
            r3.flush()     // Catch: java.lang.Throwable -> L93
            r3.close()     // Catch: java.lang.Throwable -> L89
        L89:
            if (r1 == 0) goto L90
            r1.close()     // Catch: java.lang.Throwable -> L8f
            goto L90
        L8f:
            return
        L90:
            return
        L91:
            r12 = move-exception
            goto Lac
        L93:
            r0 = r3
            goto L9a
        L95:
            r12 = move-exception
            r1 = r0
            r3 = r1
            goto Lac
        L99:
            r1 = r0
        L9a:
            r11.clearConfigFile(r13)     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto La2
            r0.close()     // Catch: java.lang.Throwable -> La2
        La2:
            if (r1 == 0) goto La9
            r1.close()     // Catch: java.lang.Throwable -> La8
            goto La9
        La8:
            return
        La9:
            return
        Laa:
            r12 = move-exception
            r3 = r0
        Lac:
            if (r3 == 0) goto Lb1
            r3.close()     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            if (r1 == 0) goto Lb6
            r1.close()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.cacheConfigDataFile(java.util.Map, java.lang.String):void");
    }

    public void cacheDebugConfig(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "697bcb6836f185771f652f3384c1b374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "697bcb6836f185771f652f3384c1b374");
            return;
        }
        Map<String, String> obtainConfigFromFile = obtainConfigFromFile(str);
        if (obtainConfigFromFile == null) {
            Logw.d("Horn", "修改配置失败，原文件不存在");
            return;
        }
        obtainConfigFromFile.put("customer", str2);
        ObjectOutputStream objectOutputStream = null;
        try {
            if (TextUtils.isEmpty(str) || obtainConfigFromFile == null) {
                return;
            }
            File debugConfigFile = getDebugConfigFile(str);
            if (debugConfigFile.exists()) {
                debugConfigFile.delete();
            }
            debugConfigFile.getParentFile().mkdirs();
            debugConfigFile.createNewFile();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(debugConfigFile));
            try {
                objectOutputStream2.writeUTF(HornUtils.getVersionName(this.mContext));
                objectOutputStream2.writeInt(obtainConfigFromFile.size());
                for (Map.Entry<String, String> entry : obtainConfigFromFile.entrySet()) {
                    objectOutputStream2.writeObject(entry.getKey());
                    objectOutputStream2.writeObject(entry.getValue());
                }
                objectOutputStream2.flush();
                try {
                    objectOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    if (InnerHorn.isDebug) {
                        th.printStackTrace();
                    }
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    ObjectOutputStream objectOutputStream3 = objectOutputStream;
                    if (objectOutputStream3 != null) {
                        try {
                            objectOutputStream3.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private java.util.Map<java.lang.String, java.lang.String> obtainConfigFromFile(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.obtainConfigFromFile(java.lang.String):java.util.Map");
    }

    private boolean needClean(String str, String str2, Map<String, String> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed7735c5627008cc1a41e59e68c3eefc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed7735c5627008cc1a41e59e68c3eefc")).booleanValue();
        }
        try {
            if (!str2.equals(str)) {
                try {
                    return new JSONObject(map.get("horn")).getBoolean("cleanCacheForUpgrade");
                } catch (JSONException unused) {
                }
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void optPublicData(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee0482efb76f0015a1786ab4427220fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee0482efb76f0015a1786ab4427220fb");
        } else if (map != null) {
            try {
                if (map.size() == 0 || TextUtils.isEmpty(str)) {
                    return;
                }
                String str2 = map.get("horn");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str2);
                HornConfigEntity hornConfigEntity = new HornConfigEntity();
                hornConfigEntity.time = jSONObject.getString("time");
                hornConfigEntity.url = jSONObject.getString("url");
                hornConfigEntity.cacheDuration = jSONObject.optInt("cacheDuration");
                try {
                    hornConfigEntity.rateLimit = jSONObject.optInt("rateLimit");
                    hornConfigEntity.version = jSONObject.optLong("version");
                } catch (Exception unused) {
                }
                hornConfigEntity.overTime = jSONObject.optBoolean("overTime");
                try {
                    hornConfigEntity.cleanCacheForUpgrade = Boolean.valueOf(jSONObject.getBoolean("cleanCacheForUpgrade"));
                } catch (JSONException unused2) {
                }
                hornConfigEntity.pollPeriod.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("pollPeriod");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = optJSONArray.getString(i);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.getDefault());
                        Date date = new Date();
                        date.setHours(simpleDateFormat.parse(string).getHours());
                        date.setMinutes(simpleDateFormat.parse(string).getMinutes());
                        hornConfigEntity.pollPeriod.add(date);
                    }
                }
                hornConfigEntity.optPollDuration(jSONObject.optInt("pollDuration"));
                if (this.mPublic.containsKey(str)) {
                    this.mPublic.remove(str);
                }
                this.mPublic.put(str, hornConfigEntity);
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
            }
        }
    }

    private boolean optCustomerData(String str, Map<String, String> map, boolean z, @Nullable MonitorRecord monitorRecord) {
        HornCallback hornCallback;
        MonitorRecord monitorRecord2;
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0defe304c6819d6adea95b70872a1460", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0defe304c6819d6adea95b70872a1460")).booleanValue();
        }
        try {
            boolean obtainOvertime = obtainOvertime(str);
            synchronized (this.mConfigCallbacks) {
                hornCallback = this.mConfigCallbacks.get(str);
            }
            if (hornCallback != null && !(hornCallback instanceof BlobCallback)) {
                String str2 = map.get("customer");
                IHornMonitorService monitorService = InnerHorn.getConfig().monitorService();
                if (monitorService == null || monitorRecord == null || !monitorService.shouldMonitorChange(str)) {
                    monitorRecord2 = null;
                } else {
                    HornConfigEntity hornConfigEntity = this.mPublic.get(str);
                    if (hornConfigEntity != null) {
                        monitorRecord.setVersion(String.valueOf(hornConfigEntity.version));
                    }
                    if (TextUtils.isEmpty(monitorRecord.getETag())) {
                        monitorRecord.setETag(obtainData(getETagFile(str)));
                    }
                    monitorRecord2 = monitorRecord;
                }
                if (!TextUtils.isEmpty(str2) && !StringUtil.NULL.equals(str2)) {
                    if (z) {
                        callbackOnChangeAsync(hornCallback, !obtainOvertime, str2, monitorRecord2, monitorService);
                    }
                    return true;
                }
                callbackOnChangeAsync(hornCallback, !obtainOvertime, "", monitorRecord2, monitorService);
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return false;
        }
    }

    private void callbackOnChangeAsync(final HornCallback hornCallback, final boolean z, final String str, @Nullable final MonitorRecord monitorRecord, @Nullable final IHornMonitorService iHornMonitorService) {
        Object[] objArr = {hornCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, monitorRecord, iHornMonitorService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abb22513b1fe62d9bfbd282464456e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abb22513b1fe62d9bfbd282464456e4");
        } else {
            b.a(c.a(), new Runnable() { // from class: com.meituan.android.common.horn.HornCacheCenter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcab1e80f66ac0ce2b04aa79cd710f23", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcab1e80f66ac0ce2b04aa79cd710f23");
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        hornCallback.onChanged(z, str);
                    } catch (Throwable th) {
                        if (monitorRecord != null) {
                            monitorRecord.setCallbackError(th.getMessage());
                        }
                    }
                    if (monitorRecord == null || iHornMonitorService == null) {
                        return;
                    }
                    monitorRecord.setCallbackTime(SystemClock.elapsedRealtime() - elapsedRealtime);
                    iHornMonitorService.onConfigChange(monitorRecord.toMap());
                }
            });
        }
    }

    private boolean optCustomerBinaryData(String str, boolean z, Exception exc) {
        HornCallback hornCallback;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c881e8fec176b316762f6533dfeb382", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c881e8fec176b316762f6533dfeb382")).booleanValue();
        }
        try {
            boolean obtainOvertime = obtainOvertime(str);
            synchronized (this.mConfigCallbacks) {
                hornCallback = this.mConfigCallbacks.get(str);
            }
            if (hornCallback != null && (hornCallback instanceof BlobCallback)) {
                if (z) {
                    BlobCallback blobCallback = (BlobCallback) hornCallback;
                    if (getBinaryFile(str).exists() && exc == null) {
                        blobCallback.onChanged(!obtainOvertime, getBinaryFile(str).getAbsolutePath());
                    } else {
                        blobCallback.onChanged(!obtainOvertime, obtainLastBinaryName(str));
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public boolean applyConfigFromCache(String str, boolean z, @Nullable MonitorRecord monitorRecord) {
        Map<String, String> hashMap;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb177112cdf7196d92b818d208659b1d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb177112cdf7196d92b818d208659b1d")).booleanValue();
        }
        File debugConfigFile = getDebugConfigFile(str);
        if (!HornInfoHub.isCacheInvalidate(str)) {
            if (debugConfigFile.exists()) {
                hashMap = obtainConfigFromDebugFile(str);
            } else {
                hashMap = obtainConfigFromCache(str);
            }
        } else {
            hashMap = new HashMap<>();
        }
        optPublicData(str, hashMap);
        if (this.mConfigCallbacks.get(str) instanceof BlobCallback) {
            return optCustomerBinaryData(str, !z ? 1 : 0, null);
        }
        return optCustomerData(str, hashMap, !z ? 1 : 0, monitorRecord);
    }

    public void NotModifyLogic(boolean z, String str, @NonNull MonitorRecord monitorRecord) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2c3ece3849fc1df51816cf44723cbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2c3ece3849fc1df51816cf44723cbc");
            return;
        }
        HornInfoHub.validateCache(str);
        if (!getConfigFile(str).exists()) {
            clearConfigFile(str);
        }
        if (!getBinaryFile(str).exists()) {
            Map<String, String> obtainConfigFromCache = obtainConfigFromCache(str);
            if (obtainConfigFromCache == null) {
                return;
            }
            String str2 = obtainConfigFromCache.get("customer");
            if (!HornUtils.isBinaryFile(str2)) {
                applyConfigFromCache(str, z, monitorRecord);
                return;
            } else {
                cacheBinaryFile(str, str2.replaceAll("horn-file-protocol-", ""));
                return;
            }
        }
        boolean applyConfigFromCache = applyConfigFromCache(str, z, monitorRecord);
        long currentTimeMillis = System.currentTimeMillis();
        Logw.d(Logw.TAG, "::applyTime304::" + new Date(currentTimeMillis));
        Logw.d(Logw.TAG, "::applyTime304::" + applyConfigFromCache);
    }

    private Map<String, String> obtainConfigFromCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee76e703a99c0a4e372e9a43101b9e74", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee76e703a99c0a4e372e9a43101b9e74");
        }
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        Map<String, String> map = this.mConfig.get(str);
        if (map == null) {
            Logw.d(Logw.TAG, str + " obtainConfigFromCache::from::file");
            Map<String, String> obtainConfigFromFile = obtainConfigFromFile(str);
            if (obtainConfigFromFile.size() != 0) {
                if (this.mConfig.containsKey(str)) {
                    this.mConfig.remove(str);
                }
                this.mConfig.put(str, obtainConfigFromFile);
            }
            return obtainConfigFromFile;
        }
        Logw.d(Logw.TAG, str + " obtainConfigFromCache::from::memory");
        return map;
    }

    public void clearConfig(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aac6c77a7cfc74ae2744a4fcb3969673", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aac6c77a7cfc74ae2744a4fcb3969673");
            return;
        }
        try {
            if (getConfigFile(str).exists()) {
                clearConfigFile(str);
            }
            this.mConfig.remove(str);
            this.mPublic.remove(str);
            applyConfigFromCache(str, z, null);
        } catch (Throwable unused) {
        }
    }

    public void clearConfigFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5658c686c1ee3ac2af5ae36b875eb590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5658c686c1ee3ac2af5ae36b875eb590");
            return;
        }
        try {
            getConfigFile(str).delete();
        } catch (Throwable unused) {
        }
        try {
            getETagFile(str).delete();
        } catch (Throwable unused2) {
        }
    }

    public void clearRequestTimeConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c51cf35ab36712e32dcffd799846ce3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c51cf35ab36712e32dcffd799846ce3e");
            return;
        }
        try {
            File requestFile = getRequestFile(str);
            if (requestFile.exists()) {
                requestFile.delete();
            }
        } catch (Throwable unused) {
        }
    }

    public int obtainCacheDuration(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9dad869f475a17b3bc532ce8b1bf2e5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9dad869f475a17b3bc532ce8b1bf2e5")).intValue();
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        if (hornConfigEntity == null) {
            return 1;
        }
        return hornConfigEntity.cacheDuration;
    }

    public int obtainRateLimit(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4006febede46bcece6d16d09cc67ac9b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4006febede46bcece6d16d09cc67ac9b")).intValue();
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        if (hornConfigEntity == null) {
            return 0;
        }
        return hornConfigEntity.rateLimit;
    }

    public long obtainVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f13016a24083d60a8c62953f29bc20aa", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f13016a24083d60a8c62953f29bc20aa")).longValue();
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        if (hornConfigEntity == null) {
            return 0L;
        }
        return hornConfigEntity.version;
    }

    public File getDebugConfigFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a13f0729c9d5041e9de0ed5617c9c54", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a13f0729c9d5041e9de0ed5617c9c54");
        }
        return new File(getCacheDir() + "/hornTest", "final_horn_config_" + str);
    }

    public int obtainPollDuration(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a073d831c172679fd6af3b0bccf3a02", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a073d831c172679fd6af3b0bccf3a02")).intValue();
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        if (hornConfigEntity == null) {
            return 1;
        }
        return hornConfigEntity.pollDuration;
    }

    private boolean obtainOvertime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d973a1b041264cdc6c348420564e76f9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d973a1b041264cdc6c348420564e76f9")).booleanValue();
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        return hornConfigEntity != null && hornConfigEntity.overTime;
    }

    public String obtainUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30664fa8ac7863443ad4f076992491f5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30664fa8ac7863443ad4f076992491f5");
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        return hornConfigEntity == null ? "N/A" : hornConfigEntity.url;
    }

    public String obtainTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b18b62b66894586c479e5d5fbb5c00", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b18b62b66894586c479e5d5fbb5c00");
        }
        HornConfigEntity hornConfigEntity = this.mPublic.get(str);
        return hornConfigEntity == null ? "N/A" : hornConfigEntity.time;
    }

    public String obtainConfig(String str) {
        Map<String, String> obtainConfigFromCache;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba07cb5a4c02c66f11c0604e0cb4477", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba07cb5a4c02c66f11c0604e0cb4477");
        }
        if (HornInfoHub.isCacheInvalidate(str)) {
            return "";
        }
        if (getDebugConfigFile(str).exists()) {
            obtainConfigFromCache = obtainConfigFromDebugFile(str);
        } else {
            obtainConfigFromCache = obtainConfigFromCache(str);
        }
        if (obtainConfigFromCache == null || obtainConfigFromCache.size() == 0) {
            Logw.d(Logw.TAG, str + " obtainConfig::selfConfig is null");
            return "";
        }
        String str2 = obtainConfigFromCache.get("customer");
        checkAccessCacheRecord(str, obtainConfigFromCache);
        Logw.d(Logw.TAG, str + " obtainConfig::selfConfig::" + str2);
        return str2;
    }

    private void checkAccessCacheRecord(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407608b6f243359b55f1e854090cff54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407608b6f243359b55f1e854090cff54");
        } else if (Looper.getMainLooper() == Looper.myLooper() || "horn_monitor_android".equals(str)) {
        } else {
            try {
                IHornMonitorService monitorService = InnerHorn.getConfig().monitorService();
                if (monitorService == null || !monitorService.shouldMonitorChange(str)) {
                    return;
                }
                MonitorRecord monitorRecord = new MonitorRecord(str);
                monitorRecord.setMode(MonitorRecord.MODE_ACCESS_CACHE);
                monitorRecord.setSource(MonitorRecord.MODE_ACCESS_CACHE);
                monitorRecord.setVersion(new JSONObject(map.get("horn")).optString("version"));
                monitorService.onConfigChange(monitorRecord.toMap());
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HornConfigEntity {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int cacheDuration;
        public Boolean cleanCacheForUpgrade;
        public boolean overTime;
        public int pollDuration;
        private List<Date> pollPeriod;
        public int rateLimit;
        public String time;
        public String url;
        public long version;

        public HornConfigEntity() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7438fa1f3a9ab29476f012b1e998075", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7438fa1f3a9ab29476f012b1e998075");
                return;
            }
            this.time = "N/A";
            this.url = "N/A";
            this.pollDuration = 10;
            this.cacheDuration = 0;
            this.rateLimit = 0;
            this.version = 0L;
            this.overTime = false;
            this.cleanCacheForUpgrade = Boolean.FALSE;
            this.pollPeriod = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void optPollDuration(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd269b482c7bc44deb3f990b50c5884", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd269b482c7bc44deb3f990b50c5884");
            } else if (this.pollDuration != -1) {
                if (isInTime()) {
                    this.pollDuration = i;
                } else {
                    this.pollDuration = 10;
                }
            }
        }

        private boolean isInTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ad39a75ed604cedff021d2b4ed48463", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ad39a75ed604cedff021d2b4ed48463")).booleanValue();
            }
            try {
                int size = this.pollPeriod.size();
                Date date = new Date();
                for (int i = 0; i < size; i += 2) {
                    Date date2 = this.pollPeriod.get(i + 1);
                    if (date.after(this.pollPeriod.get(i)) && date.before(date2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
                return false;
            }
        }
    }

    public void clearScratchFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b695a0165ff5744ea2671ee58115df4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b695a0165ff5744ea2671ee58115df4");
            return;
        }
        List<String> folderChildren = getFolderChildren(new File(getCacheDir() + "/horn"));
        File file = new File(obtainLastBinaryName(str));
        for (String str2 : folderChildren) {
            if (str2.contains("_final_horn_blob_" + str) && !str2.equals(getBinaryFile(str).getName()) && !str2.equals(file.getName())) {
                File file2 = new File(getCacheDir() + "/horn", str2);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    public void clearScratchFile(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a33253a79c5c1a72f714fdbe16ca8688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a33253a79c5c1a72f714fdbe16ca8688");
            return;
        }
        List<String> folderChildren = getFolderChildren(new File(getCacheDir() + "/horn"));
        Map<String, String> obtainAllLastBinaryName = obtainAllLastBinaryName();
        if (folderChildren == null || folderChildren.size() == 0 || obtainAllLastBinaryName == null || obtainAllLastBinaryName.size() == 0) {
            return;
        }
        for (int size = folderChildren.size() - 1; size >= 0; size--) {
            if (!folderChildren.get(size).contains("_final_horn_blob_")) {
                folderChildren.remove(folderChildren.get(size));
            }
        }
        for (String str : folderChildren) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (str.contains(next) && !str.equals(getBinaryFile(next).getName()) && !str.equals(obtainAllLastBinaryName.get(next))) {
                    File file = new File(getCacheDir() + "/horn", str);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    private List<String> getFolderChildren(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f778df7e28135c32c5a0877852246a5f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f778df7e28135c32c5a0877852246a5f");
        }
        ArrayList arrayList = new ArrayList();
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    for (String str : file.list()) {
                        File file2 = new File(file, str);
                        if (file2.isFile()) {
                            arrayList.add(file2.getName());
                        }
                    }
                }
            } catch (Exception e) {
                if (InnerHorn.isDebug) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public File getConfigFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce23069955aca50218ef0816a866587", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce23069955aca50218ef0816a866587");
        }
        return new File(getCacheDir() + "/horn", "final_horn_config_" + str);
    }

    public File getBinaryFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4d5101ad53153a15f5d4eca288a7e15", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4d5101ad53153a15f5d4eca288a7e15");
        }
        Map<String, String> obtainConfigFromCache = obtainConfigFromCache(str);
        String str2 = obtainConfigFromCache != null ? obtainConfigFromCache.get("customer") : "";
        if (str2 == null) {
            str2 = "";
        }
        return new File(getCacheDir() + "/horn", str2.replaceAll(AbsApiFactory.HTTPS, "").replaceAll("/", CommonConstant.Symbol.UNDERLINE) + "_final_horn_blob_" + str);
    }

    public File getETagFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8d50a2388d5920cf78f0d9566413c5e", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8d50a2388d5920cf78f0d9566413c5e");
        }
        return new File(getCacheDir() + "/horn", "final_horn_etag_" + str);
    }

    private File getRequestFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c39a1c842af69fc9fca529ae3da07487", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c39a1c842af69fc9fca529ae3da07487");
        }
        return new File(getCacheDir() + "/horn", "final_horn_request_" + str);
    }

    public File getInitFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dc0c8e6e34eaadaa1975416c0fdfb4d", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dc0c8e6e34eaadaa1975416c0fdfb4d");
        }
        return new File(getCacheDir() + "/horn", "final_horn_init");
    }

    public File getAlertFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "412cbbb665183cfbd32f9f3efea6dbb4", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "412cbbb665183cfbd32f9f3efea6dbb4");
        }
        return new File(getCacheDir() + "/horn", "final_horn_report_" + str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String obtainData(java.io.File r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "6df04ffd3d8177e987c4a2ba9fae40bf"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 0
            android.content.Context r1 = r11.mContext     // Catch: java.lang.Throwable -> L56
            com.meituan.android.common.horn.ProcessLock r1 = com.meituan.android.common.horn.ProcessLock.lock(r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = r12.exists()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L33
            java.lang.String r2 = ""
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return r2
        L33:
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L58
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L58
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r2.readObject()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Throwable -> L46
        L46:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r0
        L4c:
            r12 = move-exception
            r0 = r2
            goto L70
        L4f:
            r0 = r2
            goto L58
        L51:
            r12 = move-exception
            goto L70
        L53:
            r12 = move-exception
            r1 = r0
            goto L70
        L56:
            r12 = r0
            r1 = r12
        L58:
            if (r12 == 0) goto L63
            boolean r2 = r12.exists()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L63
            if (r2 == 0) goto L63
            r12.delete()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L63
        L63:
            java.lang.String r12 = ""
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            return r12
        L70:
            if (r0 == 0) goto L75
            r0.close()     // Catch: java.lang.Throwable -> L75
        L75:
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.obtainData(java.io.File):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void cacheData(java.lang.String r12, java.io.File r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "9b7f7e4b60992d98376ca76656d09f8d"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1e:
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L26
            return
        L26:
            android.content.Context r1 = r11.mContext     // Catch: java.lang.Throwable -> L62
            com.meituan.android.common.horn.ProcessLock r1 = com.meituan.android.common.horn.ProcessLock.lock(r1)     // Catch: java.lang.Throwable -> L62
            boolean r2 = r13.exists()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L35
            r13.delete()     // Catch: java.lang.Throwable -> L64
        L35:
            java.io.File r2 = r13.getParentFile()     // Catch: java.lang.Throwable -> L64
            r2.mkdirs()     // Catch: java.lang.Throwable -> L64
            r13.createNewFile()     // Catch: java.lang.Throwable -> L64
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L64
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L64
            r2.writeObject(r12)     // Catch: java.lang.Throwable -> L5d
            r2.flush()     // Catch: java.lang.Throwable -> L5d
            r2.close()     // Catch: java.lang.Throwable -> L52
        L52:
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.lang.Throwable -> L58
            goto L59
        L58:
            return
        L59:
            return
        L5a:
            r12 = move-exception
            r0 = r2
            goto L71
        L5d:
            r0 = r2
            goto L64
        L5f:
            r12 = move-exception
            r1 = r0
            goto L71
        L62:
            r13 = r0
            r1 = r13
        L64:
            if (r13 == 0) goto L7c
            boolean r12 = r13.exists()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7c
            if (r12 == 0) goto L7c
            r13.delete()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L7c
            goto L7c
        L70:
            r12 = move-exception
        L71:
            if (r0 == 0) goto L76
            r0.close()     // Catch: java.lang.Throwable -> L76
        L76:
            if (r1 == 0) goto L7b
            r1.close()     // Catch: java.lang.Throwable -> L7b
        L7b:
            throw r12
        L7c:
            if (r0 == 0) goto L81
            r0.close()     // Catch: java.lang.Throwable -> L81
        L81:
            if (r1 == 0) goto L88
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L88
        L87:
            return
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.cacheData(java.lang.String, java.io.File):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public com.meituan.android.common.horn.HornCacheCenter.TypeInfo obtainRequestInfo(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "1989711ceeb78dc79ffcdc2386aafda0"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.meituan.android.common.horn.HornCacheCenter$TypeInfo r12 = (com.meituan.android.common.horn.HornCacheCenter.TypeInfo) r12
            return r12
        L1e:
            r0 = 0
            android.content.Context r1 = r11.mContext     // Catch: java.lang.Throwable -> L78
            com.meituan.android.common.horn.ProcessLock r1 = com.meituan.android.common.horn.ProcessLock.lock(r1)     // Catch: java.lang.Throwable -> L78
            java.io.File r12 = r11.getRequestFile(r12)     // Catch: java.lang.Throwable -> L71
            boolean r2 = r12.exists()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L40
            com.meituan.android.common.horn.HornCacheCenter$TypeInfo r2 = new com.meituan.android.common.horn.HornCacheCenter$TypeInfo     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
            r2.count = r8     // Catch: java.lang.Throwable -> L6c
            r3 = 0
            r2.lastTime = r3     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            return r2
        L40:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L6c
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6a
            com.meituan.android.common.horn.HornCacheCenter$TypeInfo r4 = new com.meituan.android.common.horn.HornCacheCenter$TypeInfo     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            long r5 = r3.readLong()     // Catch: java.lang.Throwable -> L7c
            r4.lastTime = r5     // Catch: java.lang.Throwable -> L7c
            int r5 = r3.readInt()     // Catch: java.lang.Throwable -> L7c
            r4.count = r5     // Catch: java.lang.Throwable -> L7c
            r2.close()     // Catch: java.io.IOException -> L5e
        L5e:
            r3.close()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.lang.Throwable -> L66
        L66:
            return r4
        L67:
            r12 = move-exception
            r3 = r0
            goto L89
        L6a:
            r3 = r0
            goto L7c
        L6c:
            r2 = r0
            goto L7b
        L6e:
            r12 = move-exception
            r3 = r0
            goto L8a
        L71:
            r12 = r0
            r2 = r12
            goto L7b
        L74:
            r12 = move-exception
            r1 = r0
            r3 = r1
            goto L8a
        L78:
            r12 = r0
            r1 = r12
            r2 = r1
        L7b:
            r3 = r2
        L7c:
            if (r12 == 0) goto L9c
            boolean r4 = r12.exists()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L9c
            if (r4 == 0) goto L9c
            r12.delete()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L9c
            goto L9c
        L88:
            r12 = move-exception
        L89:
            r0 = r2
        L8a:
            if (r0 == 0) goto L91
            r0.close()     // Catch: java.io.IOException -> L90
            goto L91
        L90:
        L91:
            if (r3 == 0) goto L96
            r3.close()     // Catch: java.lang.Throwable -> L96
        L96:
            if (r1 == 0) goto L9b
            r1.close()     // Catch: java.lang.Throwable -> L9b
        L9b:
            throw r12
        L9c:
            if (r2 == 0) goto La3
            r2.close()     // Catch: java.io.IOException -> La2
            goto La3
        La2:
        La3:
            if (r3 == 0) goto La8
            r3.close()     // Catch: java.lang.Throwable -> La8
        La8:
            if (r1 == 0) goto Lad
            r1.close()     // Catch: java.lang.Throwable -> Lad
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.obtainRequestInfo(java.lang.String):com.meituan.android.common.horn.HornCacheCenter$TypeInfo");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void cacheRequestInfo(long r12, java.lang.String r14, int r15) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r8 = 0
            r0[r8] = r1
            r1 = 1
            r0[r1] = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.horn.HornCacheCenter.changeQuickRedirect
            java.lang.String r10 = "d8b94d37df3fc35df18bf21ef02b70bb"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2a
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L2a:
            r0 = 0
            android.content.Context r1 = r11.mContext     // Catch: java.lang.Throwable -> L72
            com.meituan.android.common.horn.ProcessLock r1 = com.meituan.android.common.horn.ProcessLock.lock(r1)     // Catch: java.lang.Throwable -> L72
            java.io.File r14 = r11.getRequestFile(r14)     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r14.exists()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L3e
            r14.delete()     // Catch: java.lang.Throwable -> L74
        L3e:
            java.io.File r2 = r14.getParentFile()     // Catch: java.lang.Throwable -> L74
            r2.mkdirs()     // Catch: java.lang.Throwable -> L74
            r14.createNewFile()     // Catch: java.lang.Throwable -> L74
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L74
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L74
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L74
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L74
            r2.writeLong(r12)     // Catch: java.lang.Throwable -> L69
            r2.writeInt(r15)     // Catch: java.lang.Throwable -> L69
            r2.flush()     // Catch: java.lang.Throwable -> L69
            r2.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L65
        L64:
            return
        L65:
            return
        L66:
            r12 = move-exception
            r0 = r2
            goto L80
        L69:
            r0 = r2
            goto L74
        L6b:
            r12 = move-exception
            goto L80
        L6d:
            r14 = r0
            goto L74
        L6f:
            r12 = move-exception
            r1 = r0
            goto L80
        L72:
            r14 = r0
            r1 = r14
        L74:
            if (r14 == 0) goto L8b
            boolean r12 = r14.exists()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L8b
            if (r12 == 0) goto L8b
            r14.delete()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L8b
            goto L8b
        L80:
            if (r0 == 0) goto L85
            r0.close()     // Catch: java.lang.Throwable -> L85
        L85:
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.lang.Throwable -> L8a
        L8a:
            throw r12
        L8b:
            if (r0 == 0) goto L90
            r0.close()     // Catch: java.lang.Throwable -> L90
        L90:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.lang.Throwable -> L96
            goto L97
        L96:
            return
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornCacheCenter.cacheRequestInfo(long, java.lang.String, int):void");
    }

    private File getCacheDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0863234ec31799d8aece477b22e74fbf", 6917529027641081856L) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0863234ec31799d8aece477b22e74fbf") : this.mContext.getFilesDir();
    }
}
