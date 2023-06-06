package org.apache.flink.cep.mlink.ikexpression.function;

import com.meituan.android.common.aidata.AIData;
import com.meituan.robust.Constants;
import com.meituan.robust.common.CommonConstant;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c {
    private static InputStream a;
    private static c b = new c();
    private HashMap<String, b> c = new HashMap<>();

    private c() {
        try {
            b();
            a();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    private void a() throws Exception {
        Object newInstance = org.apache.flink.cep.mlink.ikexpression.function.a.class.newInstance();
        Method[] declaredMethods = org.apache.flink.cep.mlink.ikexpression.function.a.class.getDeclaredMethods();
        if (declaredMethods != null) {
            for (int i = 0; i < declaredMethods.length; i++) {
                this.c.put(declaredMethods[i].getName(), new b(declaredMethods[i], newInstance));
            }
        }
    }

    private void b() throws Exception {
        Object newInstance;
        DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        d.a(AIData.getContext(), "IKExpression.cfg.xml");
        a = d.a;
        Document parse = newDocumentBuilder.parse(a);
        a.close();
        NodeList elementsByTagName = parse.getElementsByTagName("function-configuration");
        if (elementsByTagName.getLength() <= 0) {
            return;
        }
        NodeList childNodes = elementsByTagName.item(0).getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals("bean")) {
                Class<?> cls = Class.forName(item.getAttributes().getNamedItem(CommonConstant.File.CLASS).getNodeValue());
                NodeList childNodes2 = item.getChildNodes();
                HashSet hashSet = new HashSet();
                List<C1539c> list = null;
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node item2 = childNodes2.item(i2);
                    if (item2.getNodeName().equals("constructor-args") && list == null) {
                        list = a(item2);
                    } else if (item2.getNodeName().equals("function") && !hashSet.add(b(item2))) {
                        throw new SAXException("方法名不能重复");
                    }
                }
                if (hashSet.size() > 0) {
                    if (list == null || list.size() <= 0) {
                        newInstance = cls.newInstance();
                    } else {
                        newInstance = cls.getConstructor(a(list)).newInstance(b(list));
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        this.c.put(aVar.a, new b(cls.getMethod(aVar.b, a(aVar.c)), newInstance));
                    }
                }
            }
        }
    }

    private List<C1539c> a(Node node) {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals("constructor-arg")) {
                arrayList.add(new C1539c(item.getAttributes().getNamedItem("type").getNodeValue(), item.getTextContent()));
            }
        }
        return arrayList;
    }

    private a b(Node node) {
        a aVar = new a(node.getAttributes().getNamedItem("name").getNodeValue(), node.getAttributes().getNamedItem("method").getNodeValue());
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals("parameter-type")) {
                aVar.c.add(new C1539c(item.getTextContent()));
            }
        }
        return aVar;
    }

    private static Class[] a(List<C1539c> list) {
        if (list == null) {
            return null;
        }
        Class[] clsArr = new Class[list.size()];
        for (int i = 0; i < list.size(); i++) {
            clsArr[i] = list.get(i).a;
        }
        return clsArr;
    }

    private static Object[] b(List<C1539c> list) {
        if (list == null) {
            return null;
        }
        Object[] objArr = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objArr[i] = list.get(i).b;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: org.apache.flink.cep.mlink.ikexpression.function.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C1539c {
        Class a;
        Object b;

        public C1539c(String str, String str2) {
            try {
                this.a = a(str);
                this.b = this.a.getConstructor(String.class).newInstance(str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public C1539c(String str) {
            try {
                this.a = a(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static Class a(String str) throws ClassNotFoundException {
            if (Constants.BOOLEAN.equals(str)) {
                return Boolean.TYPE;
            }
            if (Constants.BYTE.equals(str)) {
                return Byte.TYPE;
            }
            if (Constants.CHAR.equals(str)) {
                return Character.TYPE;
            }
            if (Constants.DOUBLE.equals(str)) {
                return Double.TYPE;
            }
            if ("float".equals(str)) {
                return Float.TYPE;
            }
            if ("int".equals(str)) {
                return Integer.TYPE;
            }
            if (Constants.LONG.equals(str)) {
                return Long.TYPE;
            }
            if (Constants.SHORT.equals(str)) {
                return Short.TYPE;
            }
            return Class.forName(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class a {
        String a;
        String b;
        List<C1539c> c;

        public a(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException();
            }
            this.a = str;
            this.b = str2;
            this.c = new ArrayList();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class b {
        Method a;
        Object b;

        public b(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }
    }

    public static Object a(String str, Object[] objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        b bVar = b.c.get(str);
        if (bVar == null) {
            throw new NoSuchMethodException();
        }
        return bVar.a.invoke(bVar.b, objArr);
    }
}
