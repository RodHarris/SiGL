uniform sampler2D tex, tex1;

//uniform float noise_offset;

void main()
{
	//vec2 noise_lookup = gl_TexCoord[ 0 ].st;
	
	//noise_lookup.y += noise_offset;
	
	//vec2 offsets = texture2D( tex1, noise_lookup ).xy;
	
	//offsets /= 100;
	
	//vec4 color = texture2D( tex, gl_TexCoord[ 0 ].st + offsets );
	
	gl_FragColor = texture2D( tex, gl_TexCoord[ 0 ].st );
	
	gl_FragColor = color;
}
