package com.sankuai.xm.integration.mediapicker;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.titans.widget.PlayerBuilder;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.net.d;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.sankuai.xm.integration.mediapreviewer.IMediaPreviewer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MTMediaPicker implements IMediaPicker, IMediaPreviewer {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.integration.mediapicker.IMediaPicker
    public final void a(Context context, a aVar, final Callback<List<MediaResult>> callback) {
        Object[] objArr = {context, aVar, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b98f23b57b8da95dea8b98e890ed7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b98f23b57b8da95dea8b98e890ed7e");
            return;
        }
        PickerBuilder pickerBuilder = new PickerBuilder();
        pickerBuilder.maxCount(aVar.a > 0 ? aVar.a : 9);
        String str = "image";
        if (aVar.e == 2) {
            str = "video";
        } else if (aVar.e == 3) {
            str = "all";
        }
        pickerBuilder.minDuration(1);
        pickerBuilder.maxDuration(600);
        pickerBuilder.mediaType(str);
        if (aVar.f == 2) {
            pickerBuilder.source(WmChooseMediaModule.TYPE_CAMERA);
        } else if (aVar.f == 3) {
            pickerBuilder.source(WmChooseMediaModule.TYPE_CAMERA, "album");
        } else {
            pickerBuilder.source("album");
        }
        pickerBuilder.accessToken("jcyf-e4b399808a333f25");
        pickerBuilder.finishCallback(new IMediaWidgetCallback() { // from class: com.sankuai.xm.integration.mediapicker.MTMediaPicker.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.widget.IMediaWidgetCallback
            public final void onResult(ArrayList<String> arrayList, int i) {
                Object[] objArr2 = {arrayList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3121489a864aefb983fb47957f888b13", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3121489a864aefb983fb47957f888b13");
                    return;
                }
                com.sankuai.xm.log.c.b("MTMediaPicker", "size: %s, mediaSize: %s", Integer.valueOf(com.sankuai.xm.base.util.b.b(arrayList)), Integer.valueOf(i));
                if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                    callback.onSuccess(Collections.emptyList());
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    String a2 = k.a(next);
                    if (ac.a(a2)) {
                        a2 = next;
                    }
                    MediaResult mediaResult = new MediaResult(Uri.parse(next), a2.contains("video") ? 2 : 1);
                    mediaResult.d = i == 0;
                    arrayList2.add(mediaResult);
                }
                callback.onSuccess(arrayList2);
            }
        });
        Activity a2 = a(context);
        if (ActivityUtils.a(a2)) {
            MediaWidget.getInstance().openMediaPicker(a2, pickerBuilder);
        } else {
            callback.onFailure(-1, "image picker open failed.");
        }
    }

    @Override // com.sankuai.xm.integration.mediapreviewer.IMediaPreviewer
    public final void a(Context context, com.sankuai.xm.integration.mediapreviewer.c cVar, List<com.sankuai.xm.integration.mediapreviewer.a> list) {
        boolean z;
        Uri uri;
        HashMap<String, String> hashMap;
        char c = 0;
        int i = 1;
        Object[] objArr = {context, cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab81d0ea3ec6f30d1e732e8b7be708ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab81d0ea3ec6f30d1e732e8b7be708ba");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            boolean d = d.d(context);
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<HashMap<String, String>> arrayList2 = new ArrayList<>();
            for (com.sankuai.xm.integration.mediapreviewer.a aVar : list) {
                boolean z2 = aVar.e == null && aVar.f == null;
                Uri uri2 = aVar.c;
                Object[] objArr2 = new Object[i];
                objArr2[c] = uri2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08cb2144b4e09112ef06808be067b8d4", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08cb2144b4e09112ef06808be067b8d4")).booleanValue();
                } else {
                    z = uri2 != null && "file".equals(uri2.getScheme()) && k.f(uri2.getPath()) && !CryptoProxy.c().d(uri2.getPath());
                }
                boolean z3 = z && (!d || z2);
                if (z3) {
                    uri = aVar.c;
                } else {
                    uri = aVar.e != null ? aVar.e : aVar.f;
                }
                if (uri != null) {
                    HashMap<String, String> hashMap2 = null;
                    if (!z3) {
                        Object[] objArr3 = {uri};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.integration.mediapreviewer.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "99a0d4aad8358c07d35924739dad0c11", 6917529027641081856L)) {
                            hashMap = (HashMap) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "99a0d4aad8358c07d35924739dad0c11");
                        } else if (uri != null) {
                            hashMap = aVar.g.get(uri);
                        }
                        hashMap2 = hashMap;
                    }
                    arrayList.add(uri.toString());
                    arrayList2.add(hashMap2);
                }
                c = 0;
                i = 1;
            }
            PlayerBuilder playerBuilder = new PlayerBuilder();
            playerBuilder.firstAssetIndex(Math.max(cVar.a, 0));
            playerBuilder.assets(arrayList);
            playerBuilder.showVideo(false);
            playerBuilder.showIndicate(true);
            playerBuilder.headers(arrayList2);
            playerBuilder.accessToken("jcyf-e4b399808a333f25");
            Activity a2 = a(context);
            if (ActivityUtils.a(a2)) {
                MediaWidget.getInstance().openMediaPlayer(a2, playerBuilder);
            }
        }
    }

    private Activity a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef48d6050c87a0b043159580de2a22b8", 6917529027641081856L)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef48d6050c87a0b043159580de2a22b8");
        }
        Activity a2 = ActivityUtils.a(context);
        return a2 == null ? com.sankuai.xm.base.lifecycle.d.d().b() : a2;
    }
}
