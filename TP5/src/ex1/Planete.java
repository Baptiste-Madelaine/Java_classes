package ex1;

public enum Planete {
	MERCURE(3.303e+23, 2.4397e+6, TypesDePlanete.Tellurique){
		@Override
		public Planete nearestInner() {
			return null;
		}
		public Planete nearestOuter() {
			return VENUS;
		}
	},
	VENUS(4.869e+24, 6.0518e+6,TypesDePlanete.Tellurique){
		@Override
		public Planete nearestInner() {
			return MERCURE;
		}
		public Planete nearestOuter() {
			return TERRE;
		}
	},
	TERRE(5.976+24, 6.37814+6,TypesDePlanete.Tellurique){
		@Override
		public Planete nearestInner() {
			return VENUS;
		}
		public Planete nearestOuter() {
			return MARS;
		}
	},
	MARS(6.421e+23, 3.3972e+6,TypesDePlanete.Tellurique){
		@Override
		public Planete nearestInner() {
			return TERRE;
		}
		public Planete nearestOuter() {
			return JUPITER;
		}
	},
	JUPITER(1.9e+27,7.1492e+7,TypesDePlanete.Géante_Gazeuse){
		@Override
		public Planete nearestInner() {
			return MARS;
		}
		public Planete nearestOuter() {
			return SATURNE;
		}
	},
	SATURNE(5.688e+26, 6.0268e+7,TypesDePlanete.Géante_Gazeuse){
		@Override
		public Planete nearestInner() {
			return JUPITER;
		}
		public Planete nearestOuter() {
			return URANUS;
		}
	},
	URANUS(8.686e+25, 2.5559e+7,TypesDePlanete.Géante_de_Glaces){
		@Override
		public Planete nearestInner() {
			return SATURNE;
		}
		public Planete nearestOuter() {
			return NEPTUNE;
		}
	},
	NEPTUNE(1.024e+26, 2.4746e+7,TypesDePlanete.Géante_de_Glaces){
		@Override
		public Planete nearestInner() {
			return URANUS;
		}
		public Planete nearestOuter() {
			return null;
		}
	};
	
	private final double mass;
	private final double radius;
	private final TypesDePlanete type;
	private static final double G = 6.67300e-11;
	
	Planete(double mass, double radius, TypesDePlanete t){
		this.mass = mass;
		this.radius = radius;
		this.type = t;
	}
	
	public double mass() {return mass;}
	public double radius() {return radius;}
	public double graviteDeSurface() {return G*mass/(radius*radius);}
	public String toString() {return this.name() + mass + radius + graviteDeSurface(); }
	public abstract Planete nearestInner();
	public abstract Planete nearestOuter();
	public TypesDePlanete type() {return this.type;}
}
