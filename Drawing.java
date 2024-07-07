import java.util.List;
	public class Drawing {
		public String[] colours;
		public String[] shapes;
		
		public static class Art {
			public String colour;
			public String shape;
			
			public Art(String colour, String shape) {
				this.colour = colour;
				this.shape = shape;
			}
		}
		
		public IceCreamMachine(String[] colours, String[] shapes) {
			this.colours = colours;
			this.shapes = shapes;
		}
		public List<Art> mix() {
			//Create new arraylist
			List<Art> artList = new Arraylist<>();
			//iterate colour first
			for (int i = 0; i < colours.length; i++){
				//iterate shape after
				for (int j = 0; j < shapes.length; j++){
					artList.add(new Art(colours[i],shapes[j]));
					//add colour and shape into Art class, into artList arraylist
				}		
			}
			return artList;
		}
		
		public static void main(String[] args) {
			Drawing draw = new Drawing (new String[]{
			"red", "blue"
		}, new String[]{
			"circle"
		});
		
		List<Art> mixes= draw.mix();
		/*
		* Should print:
		* red, circle
		* blue, circle
		*/
			for (Art art: mixes) {
				System.out.println(art.colour + ", " + art.shape);
			}
		}
	}