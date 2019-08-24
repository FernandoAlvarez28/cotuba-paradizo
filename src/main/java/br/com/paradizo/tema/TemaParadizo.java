package br.com.paradizo.tema;

import cotuba.plugin.Tema;

public class TemaParadizo implements Tema {

	@Override
	public String getCss() {
		return FileUtils.getResourceContents("/tema.css");
	}

}