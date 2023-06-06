package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class j {
    public static List<String> a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("sum");
        a.add("avg");
        a.add("min");
        a.add("max");
        a.add("count");
        a.add("string_length");
        a.add("json_extract");
        a.add("if");
        a.add("coalesce");
    }

    public static boolean a(String str) {
        return a.contains(str);
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(Object obj) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
        org.apache.flink.cep.mlink.ikexpression.op.define.q qVar = new org.apache.flink.cep.mlink.ikexpression.op.define.q();
        if (obj != null) {
            if (obj instanceof List) {
                List list = (List) obj;
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                org.apache.flink.cep.mlink.ikexpression.op.define.q qVar2 = new org.apache.flink.cep.mlink.ikexpression.op.define.q();
                if (list.size() > 0) {
                    if (list.get(0) instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = bVar2;
                        for (int i = 0; i < list.size(); i++) {
                            bVar3 = qVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar3, (org.apache.flink.cep.mlink.ikexpression.datameta.b) list.get(i)});
                        }
                        return bVar3;
                    }
                    org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = bVar2;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        bVar4 = qVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar4, g.a(list.get(i2))});
                    }
                    return bVar4;
                }
                return bVar2;
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar5 = bVar;
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    bVar5 = qVar.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar5, g.a(jSONArray.opt(i3))});
                }
                return bVar5;
            } else {
                return g.a(obj);
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, 0);
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b b(Object obj) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b e = e(obj);
        if (e.e().intValue() == 0) {
            return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
        }
        return new org.apache.flink.cep.mlink.ikexpression.op.define.d().a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{a(obj), e});
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b c(Object obj) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
        org.apache.flink.cep.mlink.ikexpression.op.define.g gVar = new org.apache.flink.cep.mlink.ikexpression.op.define.g();
        if (obj instanceof List) {
            List list = (List) obj;
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
            org.apache.flink.cep.mlink.ikexpression.op.define.g gVar2 = new org.apache.flink.cep.mlink.ikexpression.op.define.g();
            if (list.size() > 0) {
                if (list.get(0) instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                    org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = bVar2;
                    for (int i = 0; i < list.size(); i++) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) list.get(i);
                        if (gVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar4, bVar3}).d() == Boolean.TRUE) {
                            bVar3 = bVar4;
                        }
                    }
                    return bVar3;
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar5 = bVar2;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    org.apache.flink.cep.mlink.ikexpression.datameta.b a2 = g.a(list.get(i2));
                    if (gVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{a2, bVar5}).d() == Boolean.TRUE) {
                        bVar5 = a2;
                    }
                }
                return bVar5;
            }
            return bVar2;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar6 = bVar;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b a3 = g.a(jSONArray.opt(i3));
                if (gVar.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{a3, bVar6}).d() == Boolean.TRUE) {
                    bVar6 = a3;
                }
            }
            return bVar6;
        } else {
            return g.a(obj);
        }
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b d(Object obj) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
        org.apache.flink.cep.mlink.ikexpression.op.define.i iVar = new org.apache.flink.cep.mlink.ikexpression.op.define.i();
        if (obj instanceof List) {
            List list = (List) obj;
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
            org.apache.flink.cep.mlink.ikexpression.op.define.i iVar2 = new org.apache.flink.cep.mlink.ikexpression.op.define.i();
            if (list.size() > 0) {
                Object obj2 = list.get(0);
                if (obj2 instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                    org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) obj2;
                    for (int i = 0; i < list.size(); i++) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) list.get(i);
                        if (iVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar4, bVar3}).d() == Boolean.TRUE) {
                            bVar3 = bVar4;
                        }
                    }
                    return bVar3;
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b a2 = g.a(obj2);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    org.apache.flink.cep.mlink.ikexpression.datameta.b a3 = g.a(list.get(i2));
                    if (iVar2.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{a3, a2}).d() == Boolean.TRUE) {
                        a2 = a3;
                    }
                }
                return a2;
            }
            return bVar2;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            org.apache.flink.cep.mlink.ikexpression.datameta.b a4 = g.a(jSONArray.opt(0));
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b a5 = g.a(jSONArray.opt(i3));
                if (iVar.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{a5, a4}).d() == Boolean.TRUE) {
                    a4 = a5;
                }
            }
            return a4;
        } else {
            return g.a(obj);
        }
    }

    private static org.apache.flink.cep.mlink.ikexpression.datameta.b b(List<org.apache.flink.cep.mlink.ikexpression.datameta.b> list) {
        if (list == null) {
            return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(list.size()));
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b e(Object obj) {
        if (obj != null) {
            if (obj instanceof List) {
                return b((List<org.apache.flink.cep.mlink.ikexpression.datameta.b>) obj);
            }
            if (obj instanceof JSONArray) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(((JSONArray) obj).length()));
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, 1);
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, 0);
    }

    private static org.apache.flink.cep.mlink.ikexpression.datameta.b a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(str2) && str2.contains("$.")) {
                String[] split = str2.substring(str2.indexOf("$.") + 2).replace(StringUtil.SPACE, "").split("\\.");
                for (int i = 0; i < split.length; i++) {
                    if (i < split.length - 1) {
                        if (jSONObject == null) {
                            break;
                        }
                        jSONObject = jSONObject.optJSONObject(split[i]);
                    } else if (jSONObject != null) {
                        return g.a(jSONObject.opt(split[i]));
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(Object obj, String str) {
        if (obj instanceof String) {
            return a((String) obj, str);
        }
        if (!TextUtils.isEmpty(str) && str.contains("$.")) {
            String[] split = str.substring(str.indexOf("$.") + 2).replace(StringUtil.SPACE, "").split("\\.");
            for (int i = 0; i < split.length; i++) {
                if (i < split.length - 1) {
                    if (obj == null) {
                        break;
                    }
                    obj = g.a(obj, split[i]);
                } else if (obj != null) {
                    return g.a(g.a(obj, split[i]));
                }
            }
        }
        return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3) {
        Boolean b = g.b(bVar);
        return (b == null || !b.booleanValue()) ? bVar3 : bVar2;
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(List<Object> list) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (list.size() > 0) {
            int i = 0;
            if (list.get(0) instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                while (i < list.size()) {
                    org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = (org.apache.flink.cep.mlink.ikexpression.datameta.b) list.get(i);
                    if (bVar != null && bVar.b != null) {
                        return bVar;
                    }
                    i++;
                }
            } else {
                while (i < list.size()) {
                    if (list.get(i) != null) {
                        return g.a(list.get(i));
                    }
                    i++;
                }
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) {
        if (bVar != null && bVar.b != null && bVar.a() != a.EnumC1538a.DATATYPE_NULL && bVar.b() != null) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(bVar.b().length()));
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, 0);
    }
}
