package com.sankuai.common.utils.permissionner;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.v4.app.ActivityCompat;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.dialog.IDialogProxy;
import com.sankuai.common.utils.permissionner.requester.ActivityRequester;
import com.sankuai.common.utils.permissionner.requester.FragmentRequester;
import com.sankuai.common.utils.permissionner.requester.IPermissionRequester;
import com.sankuai.common.utils.permissionner.requester.SupportFragmentRequester;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Permissionner {
    private static final long DEFAULT_DIALOG_DELAY = 500;
    private static final int MESSAGE_SHOW_PERMISSIONNER_DIALOG = 30275692;
    private static final String MTPLATFORM_COMMON_CHANNEL = "mtplatform_common";
    public static final String PERMISSION_GROUP_ACTIVITY = "android.permission-group.ACTIVITY";
    public static final String PERMISSION_GROUP_CALENDAR = "android.permission-group.CALENDAR";
    public static final String PERMISSION_GROUP_CAMERA = "android.permission-group.CAMERA";
    public static final String PERMISSION_GROUP_CONTACTS = "android.permission-group.CONTACTS";
    public static final String PERMISSION_GROUP_LOCATION = "android.permission-group.LOCATION";
    public static final String PERMISSION_GROUP_MICROPHONE = "android.permission-group.MICROPHONE";
    public static final String PERMISSION_GROUP_PHONE = "android.permission-group.PHONE";
    public static final String PERMISSION_GROUP_STORAGE = "android.permission-group.STORAGE";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static IDialogProxy currentDialog = null;
    private static volatile Handler currentHandler = null;

    /* renamed from: defaultItemLayoutResource */
    public static final int default_permissionner_item_layout = 2130968701;
    public static Map<String, GroupConfig> groupConfigs = null;
    private static boolean hasCurrentPermissionsRequest = false;
    public static Integer itemLayoutResource;
    public static Map<String, String> permissionToGroup = new HashMap();
    public static Set<String> allGroups = new HashSet();
    public static Map<String, GroupConfig> defaultGroupConfigs = new HashMap(allGroups.size());

    static {
        allGroups.add(PERMISSION_GROUP_CONTACTS);
        permissionToGroup.put("android.permission.READ_CONTACTS", PERMISSION_GROUP_CONTACTS);
        permissionToGroup.put("android.permission.WRITE_CONTACTS", PERMISSION_GROUP_CONTACTS);
        defaultGroupConfigs.put(PERMISSION_GROUP_CONTACTS, new GroupConfig(Integer.valueOf((int) R.drawable.contacts_icon), Integer.valueOf((int) R.string.permissionner_contacts_title), Integer.valueOf((int) R.string.permissionner_contacts_body)));
        allGroups.add(PERMISSION_GROUP_CALENDAR);
        permissionToGroup.put("android.permission.READ_CALENDAR", PERMISSION_GROUP_CALENDAR);
        permissionToGroup.put("android.permission.WRITE_CALENDAR", PERMISSION_GROUP_CALENDAR);
        defaultGroupConfigs.put(PERMISSION_GROUP_CALENDAR, new GroupConfig(Integer.valueOf((int) R.drawable.calendar_icon), Integer.valueOf((int) R.string.permissionner_calender_title), Integer.valueOf((int) R.string.permissionner_calender_body)));
        allGroups.add(PERMISSION_GROUP_LOCATION);
        permissionToGroup.put("android.permission.ACCESS_COARSE_LOCATION", PERMISSION_GROUP_LOCATION);
        permissionToGroup.put("android.permission.ACCESS_FINE_LOCATION", PERMISSION_GROUP_LOCATION);
        defaultGroupConfigs.put(PERMISSION_GROUP_LOCATION, new GroupConfig(Integer.valueOf((int) R.drawable.location_icon), Integer.valueOf((int) R.string.permissionner_location_title), Integer.valueOf((int) R.string.permissionner_location_body)));
        allGroups.add(PERMISSION_GROUP_PHONE);
        permissionToGroup.put("android.permission.CALL_PHONE", PERMISSION_GROUP_PHONE);
        permissionToGroup.put("android.permission.READ_PHONE_STATE", PERMISSION_GROUP_PHONE);
        defaultGroupConfigs.put(PERMISSION_GROUP_PHONE, new GroupConfig(Integer.valueOf((int) R.drawable.phone_icon), Integer.valueOf((int) R.string.permissionner_phone_title), Integer.valueOf((int) R.string.permissionner_phone_body)));
        allGroups.add(PERMISSION_GROUP_STORAGE);
        permissionToGroup.put("android.permission.READ_EXTERNAL_STORAGE", PERMISSION_GROUP_STORAGE);
        permissionToGroup.put("android.permission.WRITE_EXTERNAL_STORAGE", PERMISSION_GROUP_STORAGE);
        defaultGroupConfigs.put(PERMISSION_GROUP_STORAGE, new GroupConfig(Integer.valueOf((int) R.drawable.storage_icon), Integer.valueOf((int) R.string.permissionner_storage_title), Integer.valueOf((int) R.string.permissionner_storage_body)));
        allGroups.add(PERMISSION_GROUP_MICROPHONE);
        permissionToGroup.put("android.permission.RECORD_AUDIO", PERMISSION_GROUP_MICROPHONE);
        defaultGroupConfigs.put(PERMISSION_GROUP_MICROPHONE, new GroupConfig(Integer.valueOf((int) R.drawable.microphone_icon), Integer.valueOf((int) R.string.permissionner_microphone_title), Integer.valueOf((int) R.string.permissionner_microphone_body)));
        allGroups.add(PERMISSION_GROUP_CAMERA);
        permissionToGroup.put("android.permission.CAMERA", PERMISSION_GROUP_CAMERA);
        defaultGroupConfigs.put(PERMISSION_GROUP_CAMERA, new GroupConfig(Integer.valueOf((int) R.drawable.camera_icon), Integer.valueOf((int) R.string.permissionner_camera_title), Integer.valueOf((int) R.string.permissionner_camera_body)));
        if (Build.VERSION.SDK_INT >= 29) {
            allGroups.add(PERMISSION_GROUP_ACTIVITY);
            permissionToGroup.put("android.permission.ACTIVITY_RECOGNITION", PERMISSION_GROUP_ACTIVITY);
            defaultGroupConfigs.put(PERMISSION_GROUP_ACTIVITY, new GroupConfig(null, Integer.valueOf((int) R.string.permissionner_activity_title), Integer.valueOf((int) R.string.permissionner_activity_body)));
        }
        PermissionnerDialogFragmentBuilder.registerOnDetachListener(new OnDetachListener() { // from class: com.sankuai.common.utils.permissionner.Permissionner.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.common.utils.permissionner.OnDetachListener
            public final void onDetach() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4ebfb9cd217d0725ed6049dfa286f48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4ebfb9cd217d0725ed6049dfa286f48");
                    return;
                }
                IDialogProxy unused = Permissionner.currentDialog = null;
                Handler unused2 = Permissionner.currentHandler = null;
                boolean unused3 = Permissionner.hasCurrentPermissionsRequest = false;
            }
        });
    }

    public static void requestPermissions(@NonNull Activity activity, @NonNull String[] strArr, int i) {
        Object[] objArr = {activity, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4bf21eb46ff7649c5d7b6b927a3fa4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4bf21eb46ff7649c5d7b6b927a3fa4ab");
        } else {
            handleRequestPermissions(new ActivityRequester(activity), strArr, i);
        }
    }

    public static void requestPermissions(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        Object[] objArr = {fragment, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "abcc9b75d8ce80542baf1a6aaa86cc7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "abcc9b75d8ce80542baf1a6aaa86cc7c");
        } else {
            handleRequestPermissions(new FragmentRequester(fragment), strArr, i);
        }
    }

    public static void requestPermissions(@NonNull android.support.v4.app.Fragment fragment, @NonNull String[] strArr, int i) {
        Object[] objArr = {fragment, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ee16af7f03672aa66d8459613babdbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ee16af7f03672aa66d8459613babdbe");
        } else {
            handleRequestPermissions(new SupportFragmentRequester(fragment), strArr, i);
        }
    }

    public static void onRequestPermissionsResult(@NonNull Activity activity, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {activity, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5285f35527fb88075f522a8802ad61b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5285f35527fb88075f522a8802ad61b");
        } else {
            handleOnRequestPermissionsResult(new ActivityRequester(activity), i, strArr, iArr);
        }
    }

    public static void onRequestPermissionsResult(@NonNull Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac1339d625dc766d6bda1d5e8fb54a53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac1339d625dc766d6bda1d5e8fb54a53");
        } else {
            handleOnRequestPermissionsResult(new FragmentRequester(fragment), i, strArr, iArr);
        }
    }

    public static void onRequestPermissionsResult(@NonNull android.support.v4.app.Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5966b9a7d892dcece5bed08bbb68a2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5966b9a7d892dcece5bed08bbb68a2fc");
        } else {
            handleOnRequestPermissionsResult(new SupportFragmentRequester(fragment), i, strArr, iArr);
        }
    }

    private static void handleRequestPermissions(@NonNull final IPermissionRequester iPermissionRequester, @NonNull String[] strArr, int i) {
        Object[] objArr = {iPermissionRequester, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad571f557353cdd7f188e38660fe5486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad571f557353cdd7f188e38660fe5486");
        } else if (Build.VERSION.SDK_INT < 23) {
            Activity activity = iPermissionRequester.getActivity();
            if (activity != null) {
                ActivityCompat.requestPermissions(activity, strArr, i);
            }
        } else {
            if (isCurrentDialogEmpty() && !hasCurrentPermissionsRequest) {
                hasCurrentPermissionsRequest = true;
                Set<String> groupsFromPermissions = getGroupsFromPermissions(getShouldShowRationalePermissions(strArr, iPermissionRequester));
                if (groupsFromPermissions != null && !groupsFromPermissions.isEmpty()) {
                    final ArrayList arrayList = new ArrayList(groupsFromPermissions.size());
                    arrayList.addAll(groupsFromPermissions);
                    Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.common.utils.permissionner.Permissionner.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.os.Handler
                        public final void handleMessage(@NonNull Message message) {
                            Object[] objArr2 = {message};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b286cb079bb98ab4870c83a7a5cbf6dc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b286cb079bb98ab4870c83a7a5cbf6dc");
                            } else if (message.what == Permissionner.MESSAGE_SHOW_PERMISSIONNER_DIALOG) {
                                IDialogProxy unused = Permissionner.currentDialog = iPermissionRequester.showDialog(arrayList);
                            }
                        }
                    };
                    currentHandler = handler;
                    handler.sendEmptyMessageDelayed(MESSAGE_SHOW_PERMISSIONNER_DIALOG, 500L);
                }
            }
            iPermissionRequester.requestPermissions(strArr, i);
        }
    }

    private static void handleOnRequestPermissionsResult(@NonNull IPermissionRequester iPermissionRequester, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        q a;
        Object[] objArr = {iPermissionRequester, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0187e1b63a1a068cd6f60f66d8ea70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0187e1b63a1a068cd6f60f66d8ea70c");
        } else if (Build.VERSION.SDK_INT >= 23 && strArr.length != 0 && iArr.length != 0) {
            hasCurrentPermissionsRequest = false;
            if (currentHandler != null) {
                currentHandler.removeMessages(MESSAGE_SHOW_PERMISSIONNER_DIALOG);
                currentHandler = null;
            }
            dismissCurrentDialog();
            Context context = iPermissionRequester.getContext();
            if (context == null || (a = q.a(context, MTPLATFORM_COMMON_CHANNEL)) == null) {
                return;
            }
            PermissionnerInfoRecorder permissionnerInfoRecorder = new PermissionnerInfoRecorder(a);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr[i2] == -1 && !iPermissionRequester.shouldShowRequestPermissionRationale(strArr[i2])) {
                    permissionnerInfoRecorder.recordPermissionNeverAsk(strArr[i2], true);
                } else {
                    permissionnerInfoRecorder.recordPermissionNeverAsk(strArr[i2], false);
                }
            }
        }
    }

    private static void dismissCurrentDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88af736c3a05e797b3810baae055660f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88af736c3a05e797b3810baae055660f");
        } else if (currentDialog != null) {
            currentDialog.dismiss();
            currentDialog = null;
        }
    }

    private static boolean isCurrentDialogEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0cad83f4e14d05177b81023900e562c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0cad83f4e14d05177b81023900e562c")).booleanValue() : currentDialog == null || currentDialog.gone();
    }

    private static Set<String> getGroupsFromPermissions(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f88efc2f0b3c16cde3347d0aa1c9342b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f88efc2f0b3c16cde3347d0aa1c9342b");
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            String str2 = permissionToGroup.get(str);
            if (str2 != null) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    @RequiresApi(api = 23)
    private static Set<String> getShouldShowRationalePermissions(@NonNull String[] strArr, @NonNull IPermissionRequester iPermissionRequester) {
        Context context;
        Object[] objArr = {strArr, iPermissionRequester};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01806c344b84fd15336c039f00dac5a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01806c344b84fd15336c039f00dac5a8");
        }
        if (strArr.length == 0 || (context = iPermissionRequester.getContext()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        PermissionnerInfoRecorder permissionnerInfoRecorder = new PermissionnerInfoRecorder(q.a(context, MTPLATFORM_COMMON_CHANNEL));
        for (String str : strArr) {
            if (permissionnerInfoRecorder.shouldShowRationale(str, iPermissionRequester)) {
                hashSet.add(str);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return hashSet;
    }

    public static int getDefaultItemLayoutResource() {
        return default_permissionner_item_layout;
    }

    public static GroupConfig getDefaultConfigByGroup(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e4f742cf014d79c54fea9e5715eb9a3", RobustBitConfig.DEFAULT_VALUE) ? (GroupConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e4f742cf014d79c54fea9e5715eb9a3") : defaultGroupConfigs.get(str);
    }

    public static int getItemLayoutResource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d08d59292c10af56239edfa9848add19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d08d59292c10af56239edfa9848add19")).intValue() : itemLayoutResource == null ? default_permissionner_item_layout : itemLayoutResource.intValue();
    }

    public static GroupConfig getConfigByGroup(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16295744fa64839439775737a8eb26e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroupConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16295744fa64839439775737a8eb26e9");
        }
        if (groupConfigs != null && groupConfigs.containsKey(str)) {
            return groupConfigs.get(str);
        }
        return getDefaultConfigByGroup(str);
    }

    public static void setItemLayoutResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07dfe13a1fd0ca68f74a6eea696481a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07dfe13a1fd0ca68f74a6eea696481a8");
        } else {
            itemLayoutResource = Integer.valueOf(i);
        }
    }

    public static void setGroupConfig(@NonNull String str, @NonNull GroupConfig groupConfig) {
        Object[] objArr = {str, groupConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c33ae8a89009cac50e386f2306c58f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c33ae8a89009cac50e386f2306c58f6f");
            return;
        }
        if (groupConfigs == null) {
            groupConfigs = new HashMap(allGroups.size());
        }
        if (allGroups.contains(str)) {
            groupConfigs.put(str, groupConfig);
        }
    }

    public static void addPermissionGroup(@NonNull String str, @NonNull List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b54889f1403763ee22caca22b77d478c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b54889f1403763ee22caca22b77d478c");
            return;
        }
        allGroups.add(str);
        for (String str2 : list) {
            if (str2 != null) {
                permissionToGroup.put(str2, str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GroupConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer itemBody;
        public Integer itemIconResource;
        public Integer itemTitle;

        public GroupConfig() {
        }

        public GroupConfig(Integer num, Integer num2, Integer num3) {
            this.itemIconResource = num;
            this.itemTitle = num2;
            this.itemBody = num3;
        }
    }
}
