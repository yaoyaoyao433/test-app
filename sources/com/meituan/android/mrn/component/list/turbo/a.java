package com.meituan.android.mrn.component.list.turbo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final n b;
    final Set<TurboNode> c;
    final List<TurboNode> d;
    final l e;
    final ao f;
    final Map<String, TurboNode> g;
    final i h;
    final o i;
    final com.meituan.android.mrn.component.list.event.f j;
    private final a k;
    private final HashMap<String, Dynamic> l;

    public a(a aVar, HashMap<String, Dynamic> hashMap, n nVar, Set<TurboNode> set, List<TurboNode> list, l lVar, ao aoVar, Map<String, TurboNode> map, i iVar, com.meituan.android.mrn.component.list.event.f fVar, o oVar) {
        Object[] objArr = {aVar, hashMap, nVar, set, list, lVar, aoVar, map, iVar, fVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb466c21c7bd8358c3c657045d628b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb466c21c7bd8358c3c657045d628b1");
            return;
        }
        this.k = aVar;
        this.l = hashMap;
        this.b = nVar;
        this.c = set;
        this.d = list;
        this.e = lVar;
        this.f = aoVar;
        this.g = map;
        this.h = iVar;
        this.j = fVar;
        this.i = oVar;
    }

    public static a a(@NonNull HashMap<String, Dynamic> hashMap, n nVar, l lVar, ao aoVar, Map<String, TurboNode> map, i iVar, com.meituan.android.mrn.component.list.event.f fVar, o oVar) {
        Object[] objArr = {hashMap, nVar, lVar, aoVar, map, iVar, fVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ea03fa10196a145d64304187862511e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ea03fa10196a145d64304187862511e") : new a(null, hashMap, nVar, new HashSet(), new ArrayList(), lVar, aoVar, map, iVar, fVar, oVar);
    }

    public final Dynamic a(@NonNull String str, @Nullable String str2) {
        List<f> list;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7970d0a2b7ba358a4cc5ff6dc3a84d6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7970d0a2b7ba358a4cc5ff6dc3a84d6c");
        }
        Dynamic dynamic = this.l.get(str);
        if (dynamic != null) {
            if (!TextUtils.isEmpty(str2)) {
                n nVar = this.b;
                Object[] objArr2 = {dynamic, str2};
                ChangeQuickRedirect changeQuickRedirect2 = n.a;
                if (!PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "fecfe4523d191a7c918bb414e57b178b", RobustBitConfig.DEFAULT_VALUE)) {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = n.a;
                    if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "6c2652e1766a648572b2af1e5ce52a14", RobustBitConfig.DEFAULT_VALUE)) {
                        list = (List) PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "6c2652e1766a648572b2af1e5ce52a14");
                    } else {
                        list = nVar.b.get(str2);
                        if (list == null) {
                            list = new ArrayList<>();
                            int i = 0;
                            int i2 = -1;
                            for (int i3 = 0; i3 < str2.length(); i3++) {
                                int codePointAt = str2.codePointAt(i3);
                                if (codePointAt == 46) {
                                    if (i != 0 && i != 4) {
                                        if (i == 2) {
                                            list.add(new f(str2.substring(i2, i3)));
                                        } else {
                                            throw new IllegalStateException("input '.' at state " + i);
                                        }
                                    }
                                    i = 1;
                                } else if (codePointAt == 91) {
                                    if (i != 0 && i != 4) {
                                        if (i == 2) {
                                            list.add(new f(str2.substring(i2, i3)));
                                        } else {
                                            throw new IllegalStateException("input '[' at state " + i);
                                        }
                                    }
                                    i = 3;
                                } else if (codePointAt != 93) {
                                    if (i == 0 || i == 1) {
                                        i2 = i3;
                                        i = 2;
                                    } else if (i == 2) {
                                        continue;
                                    } else if (i == 3) {
                                        i2 = i3;
                                        i = 5;
                                    } else if (i != 5 && i == 4) {
                                        String str3 = new String(new int[]{codePointAt}, 0, 1);
                                        throw new IllegalStateException("input '" + str3 + "' at state " + i);
                                    }
                                } else if (i == 5) {
                                    list.add(new f(str2.substring(i2, i3)));
                                    i = 4;
                                } else {
                                    throw new IllegalStateException("input ']' at state " + i);
                                }
                            }
                            if (i == 2) {
                                list.add(new f(str2.substring(i2, str2.length())));
                            }
                            nVar.b.put(str2, list);
                        }
                    }
                    for (f fVar : list) {
                        if (dynamic == null) {
                            break;
                        }
                        Object[] objArr4 = {dynamic};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "b0bbfdbf5d569be705d0f4191157b658", RobustBitConfig.DEFAULT_VALUE)) {
                            dynamic = (Dynamic) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "b0bbfdbf5d569be705d0f4191157b658");
                        } else {
                            if (dynamic != null) {
                                ReadableType type = dynamic.getType();
                                if (type == ReadableType.Array && fVar.d) {
                                    dynamic = dynamic.asArray().getDynamic(fVar.c);
                                } else if (type == ReadableType.Map) {
                                    dynamic = dynamic.asMap().getDynamic(fVar.b);
                                } else if (type != ReadableType.Null) {
                                    throw new IllegalArgumentException("can't get property\"" + fVar.b + "\" of type " + type.name());
                                }
                            }
                            dynamic = null;
                        }
                    }
                } else {
                    dynamic = (Dynamic) PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "fecfe4523d191a7c918bb414e57b178b");
                }
            }
            return dynamic;
        } else if (this.k != null) {
            return this.k.a(str, str2);
        } else {
            return null;
        }
    }
}
