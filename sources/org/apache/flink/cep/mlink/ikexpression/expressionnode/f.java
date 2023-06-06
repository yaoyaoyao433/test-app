package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import com.meituan.metrics.common.Constants;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a a(JSONObject jSONObject) {
        char c;
        a dVar;
        String optString = jSONObject.optString("type");
        switch (optString.hashCode()) {
            case -2140646662:
                if (optString.equals("LessThan")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -2096394767:
                if (optString.equals("IsNull")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2062578806:
                if (optString.equals("CurrentEventReference")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1995604172:
                if (optString.equals("Subtract")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1822154468:
                if (optString.equals("Select")) {
                    c = Constants.SPACE;
                    break;
                }
                c = 65535;
                break;
            case -1701951333:
                if (optString.equals("GreaterThan")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1679816334:
                if (optString.equals("Compose")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1535819553:
                if (optString.equals("LambdaFunction")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1421166075:
                if (optString.equals("Remainder")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1150348508:
                if (optString.equals("LambdaReference")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1030184871:
                if (optString.equals("SingleEventReference")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -804566252:
                if (optString.equals("ExtractItem")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -780505664:
                if (optString.equals("LateralNumber")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -742217136:
                if (optString.equals("IsNotNull")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -655611759:
                if (optString.equals("LateralBoolean")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -638127480:
                if (optString.equals("LateralString")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -47379850:
                if (optString.equals("FunctionCall")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2365:
                if (optString.equals("If")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 2373:
                if (optString.equals("In")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2563:
                if (optString.equals("Or")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 65665:
                if (optString.equals("Add")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 65975:
                if (optString.equals("And")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 78515:
                if (optString.equals("Not")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2092895:
                if (optString.equals("Cast")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 159386799:
                if (optString.equals("EqualTo")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 682985918:
                if (optString.equals("LateralNull")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 718473796:
                if (optString.equals("Multiply")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 825151769:
                if (optString.equals("ExtractField")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1007184992:
                if (optString.equals("RegexpLike")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1564285430:
                if (optString.equals("GreaterThanOrEqual")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1718843063:
                if (optString.equals("LessThanOrEqual")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1861844001:
                if (optString.equals("MultipleEventReference")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2047371417:
                if (optString.equals("Divide")) {
                    c = '\b';
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
            case 4:
                dVar = new d(jSONObject);
                break;
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                dVar = new b(jSONObject);
                break;
            case '\n':
            case 11:
                dVar = new o(jSONObject);
                break;
            case '\f':
            case '\r':
            case 14:
            case 15:
                dVar = new e(jSONObject);
                break;
            case 16:
            case 17:
                dVar = new r(jSONObject);
                break;
            case 18:
                dVar = new p(jSONObject);
                break;
            case 19:
            case 20:
                dVar = new h(jSONObject);
                break;
            case 21:
                dVar = new i(jSONObject);
                break;
            case 22:
            case 23:
            case 24:
                dVar = new q(jSONObject);
                break;
            case 25:
                dVar = new l(jSONObject);
                break;
            case 26:
                dVar = new s(jSONObject);
                break;
            case 27:
                dVar = new c(jSONObject);
                break;
            case 28:
                dVar = new k(jSONObject);
                break;
            case 29:
                dVar = new m(jSONObject);
                break;
            case 30:
                dVar = new n(jSONObject);
                break;
            case 31:
                dVar = new ComposeExpressionNode(jSONObject);
                break;
            case ' ':
                dVar = new t(jSONObject);
                break;
            default:
                dVar = null;
                break;
        }
        if (jSONObject.has("left")) {
            dVar.b = a(jSONObject.optJSONObject("left"));
        }
        if (jSONObject.has("right")) {
            dVar.c = a(jSONObject.optJSONObject("right"));
        }
        if (jSONObject.has("child")) {
            dVar.d = a(jSONObject.optJSONObject("child"));
        }
        return dVar;
    }
}
