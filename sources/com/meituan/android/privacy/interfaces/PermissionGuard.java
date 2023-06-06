package com.meituan.android.privacy.interfaces;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.def.permission.Sys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionGuard {
    public static final String ARGS_ACTIVITY_ID = "activity_id";
    public static final String BUSINESS_CHECK_ONLY = "__checkOnly";
    public static final String BUSINESS_ID = "business_id";
    public static final int CODE_DEF = 0;
    public static final int CODE_DENIED_APP_NOT_ACCEPT = -6;
    public static final int CODE_DENIED_APP_SHOW_DIALOG = -3;
    public static final int CODE_DENIED_AUTO_TRIGGER = -15;
    public static final int CODE_DENIED_BG = -5;
    public static final int CODE_DENIED_CHECK_ONLY_DENIED = -14;
    public static final int CODE_DENIED_CHECK_ONLY_GRANT = -13;
    public static final int CODE_DENIED_DESTROYED = -17;
    public static final int CODE_DENIED_HIGH_VERSION_PERMISSION = -16;
    public static final int CODE_DENIED_ILLEGAL_ARGUMENT = -100;
    public static final int CODE_DENIED_NOT_APP_PERMISSION = -8;
    public static final int CODE_DENIED_PRIVACY_MODE = -19;
    public static final int CODE_DENIED_REFUSED_APP_PERMISSION = -9;
    public static final int CODE_DENIED_REFUSED_SYS_PERMISSION = -10;
    public static final int CODE_DENIED_REMOTE = -1;
    public static final int CODE_DENIED_STATIC = -2;
    public static final int CODE_DENIED_SYS_NOT_ACCEPT = -7;
    public static final int CODE_DENIED_SYS_SHOW_DIALOG = -4;
    public static final int CODE_DENIED_TOKEN_PERMISSION_MISMATCH = -18;
    public static final int CODE_DENIED_WITHOUT_STATIC_SYNC = -12;
    public static final int CODE_GRANT = 2;
    public static final int CODE_GRANT_MEMORY = 1;
    public static final int CODE_GRANT_WITHOUT_STATIC = 3;
    public static final int CODE_SDK_NOT_INIT = -11;
    public static final String DIALOG_TYPE_APP = "app";
    public static final String DIALOG_TYPE_APP_SYS = "app_sys";
    public static final String DIALOG_TYPE_SYS = "sys";
    public static final String PERMISSION_AL = "Al";
    public static final String PERMISSION_BLUETOOTH = "BlueTooth";
    public static final String PERMISSION_BLUETOOTH_ADMIN = "BlueTooth.admin";
    public static final String PERMISSION_BLUETOOTH_ADVERTISE = "BlueTooth.advertise";
    public static final String PERMISSION_BLUETOOTH_CONNECT = "BlueTooth.connect";
    public static final String PERMISSION_BLUETOOTH_SCAN = "BlueTooth.scan";
    public static final String PERMISSION_BODY_SENSORS = "NotImplement";
    public static final String PERMISSION_CALENDAR = "Calendar";
    public static final String PERMISSION_CALENDAR_READ = "Calendar.read";
    public static final String PERMISSION_CALENDAR_WRITE = "Calendar.write";
    public static final String PERMISSION_CAMERA = "Camera";
    public static final String PERMISSION_CLIPBOARD = "Pasteboard";
    public static final String PERMISSION_CONTACTS = "Contacts";
    public static final String PERMISSION_CONTACTS_READ = "Contacts.read";
    public static final String PERMISSION_CONTACTS_WRITE = "Contacts.write";
    public static final String PERMISSION_ID = "permission_id";
    public static final String PERMISSION_LOCATION = "Locate.once";
    public static final String PERMISSION_LOCATION_CONTINUOUS = "Locate.continuous";
    public static final String PERMISSION_LOCATION_ONCE = "Locate.once";
    public static final String PERMISSION_MICROPHONE = "Microphone";
    public static final String PERMISSION_MOTION = "Motion";
    public static final String PERMISSION_MULTIPLE_IMAGE_PICKERS = "MultiImgPicker";
    public static final String PERMISSION_PHONE_BAN = "Phone.bans";
    public static final String PERMISSION_PHONE_CALL = "Phone.call";
    public static final String PERMISSION_PHONE_READ = "Phone.read";
    public static final String PERMISSION_STORAGE = "Storage";
    public static final String PERMISSION_STORAGE_READ = "Storage.read";
    public static final String PERMISSION_STORAGE_WRITE = "Storage.write";
    public static final int PRIVACY_PERMISSION_REQUEST_CODE = 1001;
    public static ChangeQuickRedirect changeQuickRedirect;
    @GuardedBy("this")
    private final WeakHashMap<Activity, Integer> activityWeakHashMap;
    public Set<String> buHasPermissions;
    public Set<String> hasSysPermissions;
    private z initConfig;
    private volatile Context mContext;
    public Handler mMainHandler;
    private final Map<String, Set<d>> mPermissionId2GrantCallback;
    private final Map<String, com.meituan.android.privacy.interfaces.def.permission.a> mPermissionId2Permission;
    private final com.meituan.android.privacy.interfaces.def.permission.f<Sys> mSysProvider;
    @NonNull
    private WeakReference<Activity> mTopActivity;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PermissionId {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RetCode {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        @SuppressLint({"StaticFieldLeak"})
        public static final PermissionGuard a = new PermissionGuard();
    }

    public synchronized boolean topActivityIsCurrent(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7397fa21dda0bd9b502ce999ad2135e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7397fa21dda0bd9b502ce999ad2135e1")).booleanValue();
        }
        return this.activityWeakHashMap.containsKey(activity);
    }

    @Nullable
    public Activity getTopActivityProbably() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26424d90c28991b72f3f5a371ef4d0b", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26424d90c28991b72f3f5a371ef4d0b") : this.mTopActivity.get();
    }

    public synchronized void putTaskTopActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de69a4f3ecf6fd7ffdbfbd21824ff759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de69a4f3ecf6fd7ffdbfbd21824ff759");
            return;
        }
        this.activityWeakHashMap.put(activity, 1);
        this.mTopActivity = new WeakReference<>(activity);
    }

    public synchronized void removeTaskTopActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae09a1593258354a7e7ac572afcbdf3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae09a1593258354a7e7ac572afcbdf3d");
            return;
        }
        this.activityWeakHashMap.remove(activity);
        if (this.activityWeakHashMap.size() == 0) {
            this.hasSysPermissions.clear();
            this.buHasPermissions.clear();
        }
    }

    public PermissionGuard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254eed6b03d361c5c081181b5f8ffd6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254eed6b03d361c5c081181b5f8ffd6d");
            return;
        }
        this.mPermissionId2Permission = new HashMap();
        this.mSysProvider = new com.meituan.android.privacy.interfaces.def.permission.f<>(Sys.class);
        this.mPermissionId2GrantCallback = new ConcurrentHashMap();
        this.buHasPermissions = Collections.newSetFromMap(new ConcurrentHashMap());
        this.hasSysPermissions = Collections.newSetFromMap(new ConcurrentHashMap());
        this.activityWeakHashMap = new WeakHashMap<>();
        this.mTopActivity = new WeakReference<>(null);
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mPermissionId2Permission.put(PERMISSION_STORAGE, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_STORAGE, "获取你的存储信息", Arrays.asList("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")));
        this.mPermissionId2Permission.put(PERMISSION_STORAGE_READ, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_STORAGE_READ, "允许程序读取外部存储", Collections.singletonList("android.permission.READ_EXTERNAL_STORAGE")).c(PERMISSION_STORAGE));
        this.mPermissionId2Permission.put(PERMISSION_STORAGE_WRITE, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_STORAGE_WRITE, "允许程序写入外部存储", Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE")).c(PERMISSION_STORAGE));
        this.mPermissionId2Permission.put(PERMISSION_MULTIPLE_IMAGE_PICKERS, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_MULTIPLE_IMAGE_PICKERS, "允许程序读取外部存储", Collections.singletonList("android.permission.READ_EXTERNAL_STORAGE")) { // from class: com.meituan.android.privacy.interfaces.PermissionGuard.1
            @Override // com.meituan.android.privacy.interfaces.def.permission.a
            public final String a() {
                return PermissionGuard.PERMISSION_STORAGE;
            }
        }.b(PERMISSION_STORAGE_READ));
        this.mPermissionId2Permission.put("Locate.once", new com.meituan.android.privacy.interfaces.def.permission.i(this, "Locate.once", "获取你的位置信息", Arrays.asList("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION")).b("Locate.once").b(false));
        this.mPermissionId2Permission.put(PERMISSION_LOCATION_CONTINUOUS, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_LOCATION_CONTINUOUS, "获取你的位置信息", Arrays.asList("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION")).b("Locate.once"));
        this.mPermissionId2Permission.put(PERMISSION_CONTACTS, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CONTACTS, "获取你的通讯录信息", Arrays.asList("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS")));
        this.mPermissionId2Permission.put(PERMISSION_CONTACTS_READ, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CONTACTS_READ, "获取通讯录信息", Collections.singletonList("android.permission.READ_CONTACTS")).c(PERMISSION_CONTACTS));
        this.mPermissionId2Permission.put(PERMISSION_CONTACTS_WRITE, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CONTACTS_WRITE, "写入通讯录信息", Collections.singletonList("android.permission.WRITE_CONTACTS")).c(PERMISSION_CONTACTS));
        this.mPermissionId2Permission.put(PERMISSION_CAMERA, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CAMERA, "允许程序访问摄像头", Collections.singletonList("android.permission.CAMERA")));
        this.mPermissionId2Permission.put(PERMISSION_MICROPHONE, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_MICROPHONE, "允许程序录制声音", Collections.singletonList("android.permission.RECORD_AUDIO")));
        this.mPermissionId2Permission.put(PERMISSION_CALENDAR, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CALENDAR, "读写日程", Arrays.asList("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR")));
        this.mPermissionId2Permission.put(PERMISSION_CALENDAR_READ, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CALENDAR_READ, "允许程序读取日程", Collections.singletonList("android.permission.READ_CALENDAR")).c(PERMISSION_CALENDAR));
        this.mPermissionId2Permission.put(PERMISSION_CALENDAR_WRITE, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_CALENDAR_WRITE, "允许程序写入日程", Collections.singletonList("android.permission.WRITE_CALENDAR")).c(PERMISSION_CALENDAR));
        this.mPermissionId2Permission.put(PERMISSION_PHONE_READ, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_PHONE_READ, "允许程序访问电话状态", Collections.singletonList("android.permission.READ_PHONE_STATE")).b(false));
        this.mPermissionId2Permission.put(PERMISSION_PHONE_BAN, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_PHONE_BAN, "允许访问手机信息", Collections.singletonList("android.permission.READ_PHONE_STATE")).b(PERMISSION_PHONE_READ));
        this.mPermissionId2Permission.put(PERMISSION_PHONE_CALL, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_PHONE_CALL, "允许拨打电话", Collections.singletonList("android.permission.CALL_PHONE")));
        this.mPermissionId2Permission.put(PERMISSION_MOTION, new com.meituan.android.privacy.interfaces.def.permission.g(this, PERMISSION_MOTION, "健康运动权限"));
        this.mPermissionId2Permission.put(PERMISSION_BLUETOOTH, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_BLUETOOTH, "蓝牙权限", Collections.singletonList("android.permission.BLUETOOTH")).a(PERMISSION_BLUETOOTH));
        this.mPermissionId2Permission.put(PERMISSION_BLUETOOTH_ADMIN, new com.meituan.android.privacy.interfaces.def.permission.i(this, PERMISSION_BLUETOOTH_ADMIN, "蓝牙权限", Collections.singletonList("android.permission.BLUETOOTH_ADMIN")).b(PERMISSION_BLUETOOTH).a(PERMISSION_BLUETOOTH));
        Map<String, com.meituan.android.privacy.interfaces.def.permission.a> map = this.mPermissionId2Permission;
        com.meituan.android.privacy.interfaces.def.permission.j jVar = new com.meituan.android.privacy.interfaces.def.permission.j(this, PERMISSION_BLUETOOTH_ADVERTISE, "蓝牙权限", Collections.singletonList("android.permission.BLUETOOTH_ADVERTISE"));
        jVar.k = 31;
        map.put(PERMISSION_BLUETOOTH_ADVERTISE, jVar.a(PERMISSION_BLUETOOTH).b(PERMISSION_BLUETOOTH));
        Map<String, com.meituan.android.privacy.interfaces.def.permission.a> map2 = this.mPermissionId2Permission;
        com.meituan.android.privacy.interfaces.def.permission.j jVar2 = new com.meituan.android.privacy.interfaces.def.permission.j(this, PERMISSION_BLUETOOTH_CONNECT, "蓝牙权限", Collections.singletonList("android.permission.BLUETOOTH_CONNECT"));
        jVar2.k = 31;
        map2.put(PERMISSION_BLUETOOTH_CONNECT, jVar2.a(PERMISSION_BLUETOOTH).b(PERMISSION_BLUETOOTH));
        Map<String, com.meituan.android.privacy.interfaces.def.permission.a> map3 = this.mPermissionId2Permission;
        com.meituan.android.privacy.interfaces.def.permission.j jVar3 = new com.meituan.android.privacy.interfaces.def.permission.j(this, PERMISSION_BLUETOOTH_SCAN, "蓝牙权限", Collections.singletonList("android.permission.BLUETOOTH_SCAN"));
        jVar3.k = 31;
        map3.put(PERMISSION_BLUETOOTH_SCAN, jVar3.a(PERMISSION_BLUETOOTH).b(PERMISSION_BLUETOOTH));
        this.mPermissionId2Permission.put(PERMISSION_CLIPBOARD, new com.meituan.android.privacy.interfaces.def.permission.h(this, PERMISSION_CLIPBOARD, "剪切板权限"));
        this.mPermissionId2Permission.put(PERMISSION_AL, new com.meituan.android.privacy.interfaces.def.permission.h(this, PERMISSION_AL, "应用列表"));
    }

    @Nullable
    public com.meituan.android.privacy.interfaces.def.permission.a getPermission(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9461d28811b0a17d7d839e9987aa84bd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.def.permission.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9461d28811b0a17d7d839e9987aa84bd") : this.mPermissionId2Permission.get(str);
    }

    public Context getContext(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc35bd355ad3a8b2cbd58ef6563c669", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc35bd355ad3a8b2cbd58ef6563c669");
        }
        if (this.mContext == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                this.mContext = applicationContext;
            } else {
                this.mContext = context;
            }
        }
        return this.mContext;
    }

    public void dispatchGrant(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92133b0cc3e61fb89547f7d99576fdac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92133b0cc3e61fb89547f7d99576fdac");
            return;
        }
        Set<d> set = this.mPermissionId2GrantCallback.get(str);
        if (set == null) {
            return;
        }
        try {
            for (d dVar : set) {
                dVar.onResult(str, i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void registerGrantListener(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dbdcb5b3c17115cbfc404ae7c978efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dbdcb5b3c17115cbfc404ae7c978efb");
        } else if (dVar == null) {
        } else {
            callbacks(str).add(dVar);
        }
    }

    private Set<d> callbacks(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0cee865ce72f5c6fc61dcd90ce50bd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0cee865ce72f5c6fc61dcd90ce50bd8");
        }
        Set<d> set = this.mPermissionId2GrantCallback.get(str);
        if (set == null) {
            synchronized (this) {
                set = this.mPermissionId2GrantCallback.get(str);
                if (set == null) {
                    set = new CopyOnWriteArraySet<>();
                    this.mPermissionId2GrantCallback.put(str, set);
                }
            }
        }
        return set;
    }

    public void unRegisterGrantListener(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17acd384a068a6031b0712593aee60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17acd384a068a6031b0712593aee60b");
        } else if (dVar == null) {
        } else {
            callbacks(str).remove(dVar);
        }
    }

    @NonNull
    public Sys getSys() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e6f924ce9f56a40861f4e5d25377f1d", RobustBitConfig.DEFAULT_VALUE) ? (Sys) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e6f924ce9f56a40861f4e5d25377f1d") : this.mSysProvider.a(this.mContext, this);
    }

    public void setInitConfig(z zVar) {
        this.initConfig = zVar;
    }

    public z getInitConfig() {
        return this.initConfig;
    }
}
