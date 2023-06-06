package com.sankuai.waimai.ugc.creator.utils;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @NonNull
    public static ArrayList<com.sankuai.waimai.ugc.creator.entity.c> a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e87bb3e52ce2806e34481cb9565064d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e87bb3e52ce2806e34481cb9565064d");
        }
        ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList = new ArrayList<>();
        if (list != null) {
            for (ImageData imageData : list) {
                arrayList.add(imageData.a());
            }
        }
        return arrayList;
    }

    @NonNull
    public static ArrayList<com.sankuai.waimai.ugc.creator.entity.c> b(List<VideoData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "783292270e9c59f510f70f6cc8883b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "783292270e9c59f510f70f6cc8883b6a");
        }
        ArrayList<com.sankuai.waimai.ugc.creator.entity.c> arrayList = new ArrayList<>();
        for (VideoData videoData : list) {
            arrayList.add(videoData.a());
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String c(List<String> list) {
        char c;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b84f59c9c87e72b785e83f1aec8e77f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b84f59c9c87e72b785e83f1aec8e77f");
        }
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            switch (str.hashCode()) {
                case -930581174:
                    if (str.equals(PermissionGuard.PERMISSION_MICROPHONE)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -219620773:
                    if (str.equals(PermissionGuard.PERMISSION_STORAGE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 868832536:
                    if (str.equals(PermissionGuard.PERMISSION_MULTIPLE_IMAGE_PICKERS)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1016461641:
                    if (str.equals(PermissionGuard.PERMISSION_STORAGE_READ)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1450552972:
                    if (str.equals(PermissionGuard.PERMISSION_STORAGE_WRITE)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2011082565:
                    if (str.equals(PermissionGuard.PERMISSION_CAMERA)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    sb.append("存储");
                    break;
                case 4:
                    sb.append("相机");
                    break;
                case 5:
                    sb.append("录音");
                    break;
            }
            if (list.size() > 1 && i < list.size() - 1) {
                sb.append("、");
            }
        }
        return sb.toString();
    }

    public static ArrayList<ImageData> a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fe0b6208f1d5eee399259e10104def2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fe0b6208f1d5eee399259e10104def2");
        }
        ArrayList<ImageData> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) new Gson().fromJson(j.a(intent, "picList", ""), new TypeToken<ArrayList<com.sankuai.waimai.ugc.creator.entity.b>>() { // from class: com.sankuai.waimai.ugc.creator.utils.c.2
        }.getType());
        if (!com.sankuai.waimai.foundation.utils.b.b(arrayList2)) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.sankuai.waimai.ugc.creator.entity.b) it.next()).a());
            }
        }
        return arrayList;
    }
}
