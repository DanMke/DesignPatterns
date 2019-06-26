package flyweightFactory;

import java.util.HashMap;
import java.util.Map;

import concreteFlyweight.TemaAsterisco;
import concreteFlyweight.TemaHifen;
import concreteFlyweight.TemaK19;
import flyweight.TemaFlyweight;

public class TemaFlyweightFactory {
	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();

	public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN = TemaHifen.class;
	public static final Class<TemaK19> K19 = TemaK19.class;

	@SuppressWarnings("deprecation")
	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
		if (!temas.containsKey(clazz)) {
			try {
				temas.put(clazz, clazz.newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return temas.get(clazz);
	}

}
